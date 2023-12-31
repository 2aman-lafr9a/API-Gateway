package org.example.apigateway.grpc.offer;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: offer.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OfferGrpc {

  private OfferGrpc() {}

  public static final java.lang.String SERVICE_NAME = "offer.Offer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersRequest,
      org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersResponse> getGetOffersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOffers",
      requestType = org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersRequest.class,
      responseType = org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersRequest,
      org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersResponse> getGetOffersMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersRequest, org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersResponse> getGetOffersMethod;
    if ((getGetOffersMethod = OfferGrpc.getGetOffersMethod) == null) {
      synchronized (OfferGrpc.class) {
        if ((getGetOffersMethod = OfferGrpc.getGetOffersMethod) == null) {
          OfferGrpc.getGetOffersMethod = getGetOffersMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersRequest, org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOffers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OfferMethodDescriptorSupplier("GetOffers"))
              .build();
        }
      }
    }
    return getGetOffersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferRequest,
      org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferResponse> getGetOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOffer",
      requestType = org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferRequest.class,
      responseType = org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferRequest,
      org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferResponse> getGetOfferMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferRequest, org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferResponse> getGetOfferMethod;
    if ((getGetOfferMethod = OfferGrpc.getGetOfferMethod) == null) {
      synchronized (OfferGrpc.class) {
        if ((getGetOfferMethod = OfferGrpc.getGetOfferMethod) == null) {
          OfferGrpc.getGetOfferMethod = getGetOfferMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferRequest, org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOffer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OfferMethodDescriptorSupplier("GetOffer"))
              .build();
        }
      }
    }
    return getGetOfferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferRequest,
      org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferResponse> getCreateOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOffer",
      requestType = org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferRequest.class,
      responseType = org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferRequest,
      org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferResponse> getCreateOfferMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferRequest, org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferResponse> getCreateOfferMethod;
    if ((getCreateOfferMethod = OfferGrpc.getCreateOfferMethod) == null) {
      synchronized (OfferGrpc.class) {
        if ((getCreateOfferMethod = OfferGrpc.getCreateOfferMethod) == null) {
          OfferGrpc.getCreateOfferMethod = getCreateOfferMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferRequest, org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOffer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OfferMethodDescriptorSupplier("CreateOffer"))
              .build();
        }
      }
    }
    return getCreateOfferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferRequest,
      org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferResponse> getUpdateOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOffer",
      requestType = org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferRequest.class,
      responseType = org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferRequest,
      org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferResponse> getUpdateOfferMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferRequest, org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferResponse> getUpdateOfferMethod;
    if ((getUpdateOfferMethod = OfferGrpc.getUpdateOfferMethod) == null) {
      synchronized (OfferGrpc.class) {
        if ((getUpdateOfferMethod = OfferGrpc.getUpdateOfferMethod) == null) {
          OfferGrpc.getUpdateOfferMethod = getUpdateOfferMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferRequest, org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOffer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OfferMethodDescriptorSupplier("UpdateOffer"))
              .build();
        }
      }
    }
    return getUpdateOfferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferRequest,
      org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferResponse> getDeleteOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOffer",
      requestType = org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferRequest.class,
      responseType = org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferRequest,
      org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferResponse> getDeleteOfferMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferRequest, org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferResponse> getDeleteOfferMethod;
    if ((getDeleteOfferMethod = OfferGrpc.getDeleteOfferMethod) == null) {
      synchronized (OfferGrpc.class) {
        if ((getDeleteOfferMethod = OfferGrpc.getDeleteOfferMethod) == null) {
          OfferGrpc.getDeleteOfferMethod = getDeleteOfferMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferRequest, org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOffer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OfferMethodDescriptorSupplier("DeleteOffer"))
              .build();
        }
      }
    }
    return getDeleteOfferMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OfferStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OfferStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OfferStub>() {
        @java.lang.Override
        public OfferStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OfferStub(channel, callOptions);
        }
      };
    return OfferStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OfferBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OfferBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OfferBlockingStub>() {
        @java.lang.Override
        public OfferBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OfferBlockingStub(channel, callOptions);
        }
      };
    return OfferBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OfferFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OfferFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OfferFutureStub>() {
        @java.lang.Override
        public OfferFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OfferFutureStub(channel, callOptions);
        }
      };
    return OfferFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getOffers(org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOffersMethod(), responseObserver);
    }

    /**
     */
    default void getOffer(org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOfferMethod(), responseObserver);
    }

    /**
     */
    default void createOffer(org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOfferMethod(), responseObserver);
    }

    /**
     */
    default void updateOffer(org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOfferMethod(), responseObserver);
    }

    /**
     */
    default void deleteOffer(org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOfferMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Offer.
   */
  public static abstract class OfferImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OfferGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Offer.
   */
  public static final class OfferStub
      extends io.grpc.stub.AbstractAsyncStub<OfferStub> {
    private OfferStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OfferStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OfferStub(channel, callOptions);
    }

    /**
     */
    public void getOffers(org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOffersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOffer(org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOfferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createOffer(org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOfferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOffer(org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOfferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOffer(org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOfferMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Offer.
   */
  public static final class OfferBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OfferBlockingStub> {
    private OfferBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OfferBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OfferBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersResponse getOffers(org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOffersMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferResponse getOffer(org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOfferMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferResponse createOffer(org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOfferMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferResponse updateOffer(org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOfferMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferResponse deleteOffer(org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOfferMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Offer.
   */
  public static final class OfferFutureStub
      extends io.grpc.stub.AbstractFutureStub<OfferFutureStub> {
    private OfferFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OfferFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OfferFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersResponse> getOffers(
        org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOffersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferResponse> getOffer(
        org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOfferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferResponse> createOffer(
        org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOfferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferResponse> updateOffer(
        org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOfferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferResponse> deleteOffer(
        org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOfferMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_OFFERS = 0;
  private static final int METHODID_GET_OFFER = 1;
  private static final int METHODID_CREATE_OFFER = 2;
  private static final int METHODID_UPDATE_OFFER = 3;
  private static final int METHODID_DELETE_OFFER = 4;

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
        case METHODID_GET_OFFERS:
          serviceImpl.getOffers((org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersResponse>) responseObserver);
          break;
        case METHODID_GET_OFFER:
          serviceImpl.getOffer((org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferResponse>) responseObserver);
          break;
        case METHODID_CREATE_OFFER:
          serviceImpl.createOffer((org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OFFER:
          serviceImpl.updateOffer((org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferResponse>) responseObserver);
          break;
        case METHODID_DELETE_OFFER:
          serviceImpl.deleteOffer((org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferResponse>) responseObserver);
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
          getGetOffersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersRequest,
              org.example.apigateway.grpc.offer.OfferOuterClass.GetOffersResponse>(
                service, METHODID_GET_OFFERS)))
        .addMethod(
          getGetOfferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferRequest,
              org.example.apigateway.grpc.offer.OfferOuterClass.GetOfferResponse>(
                service, METHODID_GET_OFFER)))
        .addMethod(
          getCreateOfferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferRequest,
              org.example.apigateway.grpc.offer.OfferOuterClass.CreateOfferResponse>(
                service, METHODID_CREATE_OFFER)))
        .addMethod(
          getUpdateOfferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferRequest,
              org.example.apigateway.grpc.offer.OfferOuterClass.UpdateOfferResponse>(
                service, METHODID_UPDATE_OFFER)))
        .addMethod(
          getDeleteOfferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferRequest,
              org.example.apigateway.grpc.offer.OfferOuterClass.DeleteOfferResponse>(
                service, METHODID_DELETE_OFFER)))
        .build();
  }

  private static abstract class OfferBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OfferBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.apigateway.grpc.offer.OfferOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Offer");
    }
  }

  private static final class OfferFileDescriptorSupplier
      extends OfferBaseDescriptorSupplier {
    OfferFileDescriptorSupplier() {}
  }

  private static final class OfferMethodDescriptorSupplier
      extends OfferBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OfferMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OfferGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OfferFileDescriptorSupplier())
              .addMethod(getGetOffersMethod())
              .addMethod(getGetOfferMethod())
              .addMethod(getCreateOfferMethod())
              .addMethod(getUpdateOfferMethod())
              .addMethod(getDeleteOfferMethod())
              .build();
        }
      }
    }
    return result;
  }
}
