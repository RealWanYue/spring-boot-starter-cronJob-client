package com.github.cronjob.remote.grpc;

import com.github.cronjob.annotation.CronJobHandler;
import com.github.cronjob.exception.CronJobException;
import com.github.cronjob.excute.SchedularServiceImpl;
import com.github.cronjob.jobconfig.CronJobProperties;
import com.github.cronjob.jobconfig.MultiJob;
import io.etcd.jetcd.ByteSequence;
import io.etcd.jetcd.Client;
import io.etcd.jetcd.KV;
import io.etcd.jetcd.Lease;
import io.etcd.jetcd.kv.TxnResponse;
import io.etcd.jetcd.lease.LeaseGrantResponse;
import io.etcd.jetcd.lease.LeaseKeepAliveResponse;
import io.etcd.jetcd.op.Op;
import io.etcd.jetcd.options.PutOption;
import io.grpc.Server;
import io.grpc.netty.NettyServerBuilder;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @Author: wy
 * @Date: Created in 0:54 2020/3/1
 * @Description: 启动
 * @Modified: By：
 */
@Component
@Slf4j
public class JobServer implements Runnable, CommandLineRunner {
    /**
     * 生成etcd job
     * ServiceRegisterPrefix +endpoint1  value:handler1,handler2
     */
    private final static String ServiceRegisterPrefix = "/cron/register/rpc/";

    public Server server;

    @Resource
    private Client client;

    @Resource
    private MultiJob multiJob;

    @Resource
    private SchedularServiceImpl schedularService;

    @Resource
    private ServerProperties serverProperties;

    @SuppressWarnings("UnstableApiUsage")
    @Override
    public void run() {
        try {
            InetAddress address = serverProperties.getAddress();
            // obtain address
            server = NettyServerBuilder.forAddress(new InetSocketAddress(address.getHostAddress(), 0)).
                    addService(schedularService).build().start();
            deferExit(server);

            log.info("JobServer started, listening on {}", server.getPort());
            regiestToEtcd(address);

            server.awaitTermination();
        } catch (IOException | InterruptedException | ExecutionException e) {
            e.printStackTrace();
            log.error(e.getMessage());
        }
    }

    @Override
    public void run(String... args) throws Exception {
        Thread thread = new Thread(this, "JobServerThread");
        thread.setDaemon(true);
        thread.start();
    }


    protected void deferExit(Server grpcServer) {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                grpcServer.shutdown().awaitTermination(30, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                log.error(e.getMessage());
            }
            log.info("***JobServer shut down");
        }));
    }

    private static class JobKeyObserver implements StreamObserver<LeaseKeepAliveResponse> {

        @Override
        public void onNext(LeaseKeepAliveResponse value) {
            log.debug("automatic lease key[onNext]");
        }

        @Override
        public void onError(Throwable t) {
            log.error(t.getMessage());
        }

        @Override
        public void onCompleted() {
            log.info("automatic lease key");
        }
    }

    /**
     * 生成etcd job key
     *
     * @param host
     * @param port
     * @return
     */
    private static ByteSequence ConversionKey(String host, int port, String handlerName) {
        return ByteSequence.from(ServiceRegisterPrefix + handlerName + "/" + host + ":" + port, Charset.defaultCharset());
    }

    /**
     * 生成etcd job value
     *
     * @param handlers
     * @return
     */
    private static ByteSequence ConversionValue(Set<String> handlers) {
        Optional<String> reduce = handlers.stream().reduce((x, y) -> x + "," + y);
        return ByteSequence.from(reduce.orElse(""), Charset.defaultCharset());
    }

    /**
     * 注册到etcd
     *
     * @param address
     * @throws InterruptedException
     * @throws ExecutionException
     */
    @SuppressWarnings("UnstableApiUsage")
    private void regiestToEtcd(InetAddress address) throws InterruptedException, ExecutionException {
        // Generate a lease
        Lease leaseClient = client.getLeaseClient();
        CompletableFuture<LeaseGrantResponse> grant = leaseClient.grant(10, 30, TimeUnit.SECONDS);

        // Register to etcd
        KV kvClient = client.getKVClient();

        LeaseGrantResponse leaseGrantResponse = grant.get();
        long id = leaseGrantResponse.getID();
        // keepAlive key
        leaseClient.keepAlive(id, new JobKeyObserver());

        HashMap<String, CronJobHandler<?>> executeHandlerMap = multiJob.getExecuteHandlerMap();
        //生成批量put事务
        Op[] putOps = executeHandlerMap.keySet().stream().map(handler -> {
            ByteSequence key = ConversionKey(address.getHostAddress(), server.getPort(), handler);
            return Op.put(key, ByteSequence.EMPTY, PutOption.newBuilder().withLeaseId(id).build());
        }).toArray(Op[]::new);

        CompletableFuture<TxnResponse> commit = kvClient.txn().If().Then(putOps).commit();
        TxnResponse txnResponse = commit.get();
        if (txnResponse.isSucceeded()) {
            log.info("cron Job registration success");
        } else {
            log.error("cron Job registration failed");
            throw new CronJobException("cron Job registration failed");
        }

//        kvClient.put(ConversionKey(address.getHostAddress(), server.getPort(), cronJobProperties.getAppName()),
//                ConversionValue(executeHandlerMap.keySet()),
//                PutOption.newBuilder().withLeaseId(id).build());
    }
}
