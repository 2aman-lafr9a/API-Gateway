package org.example.apigateway.grpc.rating;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: rating.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RatingGrpc {

  private RatingGrpc() {}

  public static final java.lang.String SERVICE_NAME = "rating.Rating";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingRequest,
      org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingResponse> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindById",
      requestType = org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingRequest.class,
      responseType = org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingRequest,
      org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingResponse> getFindByIdMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingRequest, org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingResponse> getFindByIdMethod;
    if ((getFindByIdMethod = RatingGrpc.getFindByIdMethod) == null) {
      synchronized (RatingGrpc.class) {
        if ((getFindByIdMethod = RatingGrpc.getFindByIdMethod) == null) {
          RatingGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingRequest, org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RatingMethodDescriptorSupplier("FindById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsRequest,
      org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsResponse> getFindAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindAll",
      requestType = org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsRequest.class,
      responseType = org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsRequest,
      org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsResponse> getFindAllMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsRequest, org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsResponse> getFindAllMethod;
    if ((getFindAllMethod = RatingGrpc.getFindAllMethod) == null) {
      synchronized (RatingGrpc.class) {
        if ((getFindAllMethod = RatingGrpc.getFindAllMethod) == null) {
          RatingGrpc.getFindAllMethod = getFindAllMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsRequest, org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RatingMethodDescriptorSupplier("FindAll"))
              .build();
        }
      }
    }
    return getFindAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingRequest,
      org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingRequest.class,
      responseType = org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingRequest,
      org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingRequest, org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingResponse> getUpdateMethod;
    if ((getUpdateMethod = RatingGrpc.getUpdateMethod) == null) {
      synchronized (RatingGrpc.class) {
        if ((getUpdateMethod = RatingGrpc.getUpdateMethod) == null) {
          RatingGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingRequest, org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RatingMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RatingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RatingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RatingStub>() {
        @java.lang.Override
        public RatingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RatingStub(channel, callOptions);
        }
      };
    return RatingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RatingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RatingBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RatingBlockingStub>() {
        @java.lang.Override
        public RatingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RatingBlockingStub(channel, callOptions);
        }
      };
    return RatingBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RatingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RatingFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RatingFutureStub>() {
        @java.lang.Override
        public RatingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RatingFutureStub(channel, callOptions);
        }
      };
    return RatingFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void findById(org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    default void findAll(org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    /**
     */
    default void update(org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Rating.
   */
  public static abstract class RatingImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RatingGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Rating.
   */
  public static final class RatingStub
      extends io.grpc.stub.AbstractAsyncStub<RatingStub> {
    private RatingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RatingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RatingStub(channel, callOptions);
    }

    /**
     */
    public void findById(org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAll(org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Rating.
   */
  public static final class RatingBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RatingBlockingStub> {
    private RatingBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RatingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RatingBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingResponse findById(org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsResponse findAll(org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingResponse update(org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Rating.
   */
  public static final class RatingFutureStub
      extends io.grpc.stub.AbstractFutureStub<RatingFutureStub> {
    private RatingFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RatingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RatingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingResponse> findById(
        org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsResponse> findAll(
        org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingResponse> update(
        org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_BY_ID = 0;
  private static final int METHODID_FIND_ALL = 1;
  private static final int METHODID_UPDATE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingResponse>) responseObserver);
          break;
        case METHODID_FIND_ALL:
          serviceImpl.findAll((org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getFindByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingRequest,
              org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingResponse>(
                service, METHODID_FIND_BY_ID)))
        .addMethod(
          getFindAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsRequest,
              org.example.apigateway.grpc.rating.RatingOuterClass.GetRatingsResponse>(
                service, METHODID_FIND_ALL)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingRequest,
              org.example.apigateway.grpc.rating.RatingOuterClass.UpdateRatingResponse>(
                service, METHODID_UPDATE)))
        .build();
  }

  private static abstract class RatingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RatingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.apigateway.grpc.rating.RatingOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Rating");
    }
  }

  private static final class RatingFileDescriptorSupplier
      extends RatingBaseDescriptorSupplier {
    RatingFileDescriptorSupplier() {}
  }

  private static final class RatingMethodDescriptorSupplier
      extends RatingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RatingMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RatingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RatingFileDescriptorSupplier())
              .addMethod(getFindByIdMethod())
              .addMethod(getFindAllMethod())
              .addMethod(getUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
