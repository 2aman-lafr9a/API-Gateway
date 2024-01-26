package org.example.apigateway.grpc.agency;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: agency.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AgencyGrpc {

  private AgencyGrpc() {}

  public static final java.lang.String SERVICE_NAME = "agency.Agency";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesRequest,
      org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesResponse> getGetAgenciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgencies",
      requestType = org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesRequest.class,
      responseType = org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesRequest,
      org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesResponse> getGetAgenciesMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesRequest, org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesResponse> getGetAgenciesMethod;
    if ((getGetAgenciesMethod = AgencyGrpc.getGetAgenciesMethod) == null) {
      synchronized (AgencyGrpc.class) {
        if ((getGetAgenciesMethod = AgencyGrpc.getGetAgenciesMethod) == null) {
          AgencyGrpc.getGetAgenciesMethod = getGetAgenciesMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesRequest, org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgencies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgencyMethodDescriptorSupplier("GetAgencies"))
              .build();
        }
      }
    }
    return getGetAgenciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyRequest,
      org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyResponse> getGetAgencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgency",
      requestType = org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyRequest.class,
      responseType = org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyRequest,
      org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyResponse> getGetAgencyMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyRequest, org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyResponse> getGetAgencyMethod;
    if ((getGetAgencyMethod = AgencyGrpc.getGetAgencyMethod) == null) {
      synchronized (AgencyGrpc.class) {
        if ((getGetAgencyMethod = AgencyGrpc.getGetAgencyMethod) == null) {
          AgencyGrpc.getGetAgencyMethod = getGetAgencyMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyRequest, org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgencyMethodDescriptorSupplier("GetAgency"))
              .build();
        }
      }
    }
    return getGetAgencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyRequest,
      org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyResponse> getCreateAgencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAgency",
      requestType = org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyRequest.class,
      responseType = org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyRequest,
      org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyResponse> getCreateAgencyMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyRequest, org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyResponse> getCreateAgencyMethod;
    if ((getCreateAgencyMethod = AgencyGrpc.getCreateAgencyMethod) == null) {
      synchronized (AgencyGrpc.class) {
        if ((getCreateAgencyMethod = AgencyGrpc.getCreateAgencyMethod) == null) {
          AgencyGrpc.getCreateAgencyMethod = getCreateAgencyMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyRequest, org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAgency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgencyMethodDescriptorSupplier("CreateAgency"))
              .build();
        }
      }
    }
    return getCreateAgencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyRequest,
      org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyResponse> getUpdateAgencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgency",
      requestType = org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyRequest.class,
      responseType = org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyRequest,
      org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyResponse> getUpdateAgencyMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyRequest, org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyResponse> getUpdateAgencyMethod;
    if ((getUpdateAgencyMethod = AgencyGrpc.getUpdateAgencyMethod) == null) {
      synchronized (AgencyGrpc.class) {
        if ((getUpdateAgencyMethod = AgencyGrpc.getUpdateAgencyMethod) == null) {
          AgencyGrpc.getUpdateAgencyMethod = getUpdateAgencyMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyRequest, org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAgency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgencyMethodDescriptorSupplier("UpdateAgency"))
              .build();
        }
      }
    }
    return getUpdateAgencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyRequest,
      org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyResponse> getDeleteAgencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAgency",
      requestType = org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyRequest.class,
      responseType = org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyRequest,
      org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyResponse> getDeleteAgencyMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyRequest, org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyResponse> getDeleteAgencyMethod;
    if ((getDeleteAgencyMethod = AgencyGrpc.getDeleteAgencyMethod) == null) {
      synchronized (AgencyGrpc.class) {
        if ((getDeleteAgencyMethod = AgencyGrpc.getDeleteAgencyMethod) == null) {
          AgencyGrpc.getDeleteAgencyMethod = getDeleteAgencyMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyRequest, org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAgency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgencyMethodDescriptorSupplier("DeleteAgency"))
              .build();
        }
      }
    }
    return getDeleteAgencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletRequest,
      org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletResponse> getGetAgencyByWalletMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgencyByWallet",
      requestType = org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletRequest.class,
      responseType = org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletRequest,
      org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletResponse> getGetAgencyByWalletMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletRequest, org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletResponse> getGetAgencyByWalletMethod;
    if ((getGetAgencyByWalletMethod = AgencyGrpc.getGetAgencyByWalletMethod) == null) {
      synchronized (AgencyGrpc.class) {
        if ((getGetAgencyByWalletMethod = AgencyGrpc.getGetAgencyByWalletMethod) == null) {
          AgencyGrpc.getGetAgencyByWalletMethod = getGetAgencyByWalletMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletRequest, org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgencyByWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgencyMethodDescriptorSupplier("GetAgencyByWallet"))
              .build();
        }
      }
    }
    return getGetAgencyByWalletMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AgencyStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgencyStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgencyStub>() {
        @java.lang.Override
        public AgencyStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgencyStub(channel, callOptions);
        }
      };
    return AgencyStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgencyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgencyBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgencyBlockingStub>() {
        @java.lang.Override
        public AgencyBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgencyBlockingStub(channel, callOptions);
        }
      };
    return AgencyBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AgencyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgencyFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgencyFutureStub>() {
        @java.lang.Override
        public AgencyFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgencyFutureStub(channel, callOptions);
        }
      };
    return AgencyFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAgencies(org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgenciesMethod(), responseObserver);
    }

    /**
     */
    default void getAgency(org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgencyMethod(), responseObserver);
    }

    /**
     */
    default void createAgency(org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAgencyMethod(), responseObserver);
    }

    /**
     */
    default void updateAgency(org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAgencyMethod(), responseObserver);
    }

    /**
     */
    default void deleteAgency(org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAgencyMethod(), responseObserver);
    }

    /**
     */
    default void getAgencyByWallet(org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgencyByWalletMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Agency.
   */
  public static abstract class AgencyImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AgencyGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Agency.
   */
  public static final class AgencyStub
      extends io.grpc.stub.AbstractAsyncStub<AgencyStub> {
    private AgencyStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgencyStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgencyStub(channel, callOptions);
    }

    /**
     */
    public void getAgencies(org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgenciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAgency(org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAgency(org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAgencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAgency(org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAgencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAgency(org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAgencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAgencyByWallet(org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgencyByWalletMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Agency.
   */
  public static final class AgencyBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AgencyBlockingStub> {
    private AgencyBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgencyBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgencyBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesResponse getAgencies(org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgenciesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyResponse getAgency(org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgencyMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyResponse createAgency(org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAgencyMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyResponse updateAgency(org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAgencyMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyResponse deleteAgency(org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAgencyMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletResponse getAgencyByWallet(org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgencyByWalletMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Agency.
   */
  public static final class AgencyFutureStub
      extends io.grpc.stub.AbstractFutureStub<AgencyFutureStub> {
    private AgencyFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgencyFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgencyFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesResponse> getAgencies(
        org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgenciesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyResponse> getAgency(
        org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgencyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyResponse> createAgency(
        org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAgencyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyResponse> updateAgency(
        org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAgencyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyResponse> deleteAgency(
        org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAgencyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletResponse> getAgencyByWallet(
        org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgencyByWalletMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AGENCIES = 0;
  private static final int METHODID_GET_AGENCY = 1;
  private static final int METHODID_CREATE_AGENCY = 2;
  private static final int METHODID_UPDATE_AGENCY = 3;
  private static final int METHODID_DELETE_AGENCY = 4;
  private static final int METHODID_GET_AGENCY_BY_WALLET = 5;

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
        case METHODID_GET_AGENCIES:
          serviceImpl.getAgencies((org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesResponse>) responseObserver);
          break;
        case METHODID_GET_AGENCY:
          serviceImpl.getAgency((org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyResponse>) responseObserver);
          break;
        case METHODID_CREATE_AGENCY:
          serviceImpl.createAgency((org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AGENCY:
          serviceImpl.updateAgency((org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyResponse>) responseObserver);
          break;
        case METHODID_DELETE_AGENCY:
          serviceImpl.deleteAgency((org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyResponse>) responseObserver);
          break;
        case METHODID_GET_AGENCY_BY_WALLET:
          serviceImpl.getAgencyByWallet((org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletResponse>) responseObserver);
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
          getGetAgenciesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesRequest,
              org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgenciesResponse>(
                service, METHODID_GET_AGENCIES)))
        .addMethod(
          getGetAgencyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyRequest,
              org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyResponse>(
                service, METHODID_GET_AGENCY)))
        .addMethod(
          getCreateAgencyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyRequest,
              org.example.apigateway.grpc.agency.AgencyOuterClass.CreateAgencyResponse>(
                service, METHODID_CREATE_AGENCY)))
        .addMethod(
          getUpdateAgencyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyRequest,
              org.example.apigateway.grpc.agency.AgencyOuterClass.UpdateAgencyResponse>(
                service, METHODID_UPDATE_AGENCY)))
        .addMethod(
          getDeleteAgencyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyRequest,
              org.example.apigateway.grpc.agency.AgencyOuterClass.DeleteAgencyResponse>(
                service, METHODID_DELETE_AGENCY)))
        .addMethod(
          getGetAgencyByWalletMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletRequest,
              org.example.apigateway.grpc.agency.AgencyOuterClass.GetAgencyByWalletResponse>(
                service, METHODID_GET_AGENCY_BY_WALLET)))
        .build();
  }

  private static abstract class AgencyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AgencyBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.apigateway.grpc.agency.AgencyOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Agency");
    }
  }

  private static final class AgencyFileDescriptorSupplier
      extends AgencyBaseDescriptorSupplier {
    AgencyFileDescriptorSupplier() {}
  }

  private static final class AgencyMethodDescriptorSupplier
      extends AgencyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AgencyMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AgencyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AgencyFileDescriptorSupplier())
              .addMethod(getGetAgenciesMethod())
              .addMethod(getGetAgencyMethod())
              .addMethod(getCreateAgencyMethod())
              .addMethod(getUpdateAgencyMethod())
              .addMethod(getDeleteAgencyMethod())
              .addMethod(getGetAgencyByWalletMethod())
              .build();
        }
      }
    }
    return result;
  }
}
