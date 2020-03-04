package com.github.cronjob.excute;

import com.github.cronjob.protocol.entity.ExecuteRequest;
import com.github.cronjob.protocol.entity.ExecuteResult;
import com.github.cronjob.protocol.service.JobExecuterGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: wy
 * @Date: Created in 22:24 2020/3/1
 * @Description:
 * @Modified: By：
 */
@Slf4j
public abstract class AbstractJobExecuter extends JobExecuterGrpc.JobExecuterImplBase {

    @Override
    public void execute(ExecuteRequest request, StreamObserver<ExecuteResult> responseObserver) {
        log.debug("调度了");
        responseObserver.onNext(doExecute(request));
        responseObserver.onCompleted();
    }

    protected abstract ExecuteResult doExecute(ExecuteRequest request);
}
