package com.github.cronjob.protocol.service;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.15.0)",
    comments = "Source: SchedularService.proto")
public class JobExecuterGrpc {

  private JobExecuterGrpc() {}

  public static final String SERVICE_NAME = "com.github.cronjob.JobExecuter";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.github.cronjob.protocol.entity.ExecuteRequest,
      com.github.cronjob.protocol.entity.ExecuteResult> METHOD_EXECUTE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.github.cronjob.JobExecuter", "execute"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.github.cronjob.protocol.entity.ExecuteRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.github.cronjob.protocol.entity.ExecuteResult.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobExecuterStub newStub(io.grpc.Channel channel) {
    return new JobExecuterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobExecuterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JobExecuterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static JobExecuterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JobExecuterFutureStub(channel);
  }

  /**
   */
  @Deprecated public static interface JobExecuter {

    /**
     */
    public void execute(com.github.cronjob.protocol.entity.ExecuteRequest request,
                        io.grpc.stub.StreamObserver<com.github.cronjob.protocol.entity.ExecuteResult> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class JobExecuterImplBase implements JobExecuter, io.grpc.BindableService {

    @Override
    public void execute(com.github.cronjob.protocol.entity.ExecuteRequest request,
        io.grpc.stub.StreamObserver<com.github.cronjob.protocol.entity.ExecuteResult> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EXECUTE, responseObserver);
    }

    @Override public io.grpc.ServerServiceDefinition bindService() {
      return JobExecuterGrpc.bindService(this);
    }
  }

  /**
   */
  @Deprecated public static interface JobExecuterBlockingClient {

    /**
     */
    public com.github.cronjob.protocol.entity.ExecuteResult execute(com.github.cronjob.protocol.entity.ExecuteRequest request);
  }

  /**
   */
  @Deprecated public static interface JobExecuterFutureClient {

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.cronjob.protocol.entity.ExecuteResult> execute(
            com.github.cronjob.protocol.entity.ExecuteRequest request);
  }

  public static class JobExecuterStub extends io.grpc.stub.AbstractStub<JobExecuterStub>
      implements JobExecuter {
    private JobExecuterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobExecuterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected JobExecuterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobExecuterStub(channel, callOptions);
    }

    @Override
    public void execute(com.github.cronjob.protocol.entity.ExecuteRequest request,
        io.grpc.stub.StreamObserver<com.github.cronjob.protocol.entity.ExecuteResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EXECUTE, getCallOptions()), request, responseObserver);
    }
  }

  public static class JobExecuterBlockingStub extends io.grpc.stub.AbstractStub<JobExecuterBlockingStub>
      implements JobExecuterBlockingClient {
    private JobExecuterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobExecuterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected JobExecuterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobExecuterBlockingStub(channel, callOptions);
    }

    @Override
    public com.github.cronjob.protocol.entity.ExecuteResult execute(com.github.cronjob.protocol.entity.ExecuteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EXECUTE, getCallOptions(), request);
    }
  }

  public static class JobExecuterFutureStub extends io.grpc.stub.AbstractStub<JobExecuterFutureStub>
      implements JobExecuterFutureClient {
    private JobExecuterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobExecuterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected JobExecuterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobExecuterFutureStub(channel, callOptions);
    }

    @Override
    public com.google.common.util.concurrent.ListenableFuture<com.github.cronjob.protocol.entity.ExecuteResult> execute(
        com.github.cronjob.protocol.entity.ExecuteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EXECUTE, getCallOptions()), request);
    }
  }

  @Deprecated public static abstract class AbstractJobExecuter extends JobExecuterImplBase {}

  private static final int METHODID_EXECUTE = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobExecuter serviceImpl;
    private final int methodId;

    public MethodHandlers(JobExecuter serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXECUTE:
          serviceImpl.execute((com.github.cronjob.protocol.entity.ExecuteRequest) request,
              (io.grpc.stub.StreamObserver<com.github.cronjob.protocol.entity.ExecuteResult>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_EXECUTE);
  }

  @Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final JobExecuter serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_EXECUTE,
          asyncUnaryCall(
            new MethodHandlers<
              com.github.cronjob.protocol.entity.ExecuteRequest,
              com.github.cronjob.protocol.entity.ExecuteResult>(
                serviceImpl, METHODID_EXECUTE)))
        .build();
  }
}
