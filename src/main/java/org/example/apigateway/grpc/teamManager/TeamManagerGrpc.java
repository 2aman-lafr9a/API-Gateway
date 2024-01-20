package org.example.apigateway.grpc.teamManager;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: teamManager.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TeamManagerGrpc {

  private TeamManagerGrpc() {}

  public static final java.lang.String SERVICE_NAME = "teamManager.TeamManager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerRequest,
      org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerResponse> getGetTeamManagerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTeamManager",
      requestType = org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerRequest.class,
      responseType = org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerRequest,
      org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerResponse> getGetTeamManagerMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerRequest, org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerResponse> getGetTeamManagerMethod;
    if ((getGetTeamManagerMethod = TeamManagerGrpc.getGetTeamManagerMethod) == null) {
      synchronized (TeamManagerGrpc.class) {
        if ((getGetTeamManagerMethod = TeamManagerGrpc.getGetTeamManagerMethod) == null) {
          TeamManagerGrpc.getGetTeamManagerMethod = getGetTeamManagerMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerRequest, org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTeamManager"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamManagerMethodDescriptorSupplier("GetTeamManager"))
              .build();
        }
      }
    }
    return getGetTeamManagerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersRequest,
      org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersResponse> getGetTeamManagersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTeamManagers",
      requestType = org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersRequest.class,
      responseType = org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersRequest,
      org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersResponse> getGetTeamManagersMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersRequest, org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersResponse> getGetTeamManagersMethod;
    if ((getGetTeamManagersMethod = TeamManagerGrpc.getGetTeamManagersMethod) == null) {
      synchronized (TeamManagerGrpc.class) {
        if ((getGetTeamManagersMethod = TeamManagerGrpc.getGetTeamManagersMethod) == null) {
          TeamManagerGrpc.getGetTeamManagersMethod = getGetTeamManagersMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersRequest, org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTeamManagers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamManagerMethodDescriptorSupplier("GetTeamManagers"))
              .build();
        }
      }
    }
    return getGetTeamManagersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerRequest,
      org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerResponse> getCreateTeamManagerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTeamManager",
      requestType = org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerRequest.class,
      responseType = org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerRequest,
      org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerResponse> getCreateTeamManagerMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerRequest, org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerResponse> getCreateTeamManagerMethod;
    if ((getCreateTeamManagerMethod = TeamManagerGrpc.getCreateTeamManagerMethod) == null) {
      synchronized (TeamManagerGrpc.class) {
        if ((getCreateTeamManagerMethod = TeamManagerGrpc.getCreateTeamManagerMethod) == null) {
          TeamManagerGrpc.getCreateTeamManagerMethod = getCreateTeamManagerMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerRequest, org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTeamManager"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamManagerMethodDescriptorSupplier("CreateTeamManager"))
              .build();
        }
      }
    }
    return getCreateTeamManagerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerRequest,
      org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerResponse> getUpdateTeamManagerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTeamManager",
      requestType = org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerRequest.class,
      responseType = org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerRequest,
      org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerResponse> getUpdateTeamManagerMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerRequest, org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerResponse> getUpdateTeamManagerMethod;
    if ((getUpdateTeamManagerMethod = TeamManagerGrpc.getUpdateTeamManagerMethod) == null) {
      synchronized (TeamManagerGrpc.class) {
        if ((getUpdateTeamManagerMethod = TeamManagerGrpc.getUpdateTeamManagerMethod) == null) {
          TeamManagerGrpc.getUpdateTeamManagerMethod = getUpdateTeamManagerMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerRequest, org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTeamManager"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamManagerMethodDescriptorSupplier("UpdateTeamManager"))
              .build();
        }
      }
    }
    return getUpdateTeamManagerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerRequest,
      org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerResponse> getDeleteTeamManagerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTeamManager",
      requestType = org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerRequest.class,
      responseType = org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerRequest,
      org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerResponse> getDeleteTeamManagerMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerRequest, org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerResponse> getDeleteTeamManagerMethod;
    if ((getDeleteTeamManagerMethod = TeamManagerGrpc.getDeleteTeamManagerMethod) == null) {
      synchronized (TeamManagerGrpc.class) {
        if ((getDeleteTeamManagerMethod = TeamManagerGrpc.getDeleteTeamManagerMethod) == null) {
          TeamManagerGrpc.getDeleteTeamManagerMethod = getDeleteTeamManagerMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerRequest, org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTeamManager"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamManagerMethodDescriptorSupplier("DeleteTeamManager"))
              .build();
        }
      }
    }
    return getDeleteTeamManagerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TeamManagerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TeamManagerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TeamManagerStub>() {
        @java.lang.Override
        public TeamManagerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TeamManagerStub(channel, callOptions);
        }
      };
    return TeamManagerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TeamManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TeamManagerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TeamManagerBlockingStub>() {
        @java.lang.Override
        public TeamManagerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TeamManagerBlockingStub(channel, callOptions);
        }
      };
    return TeamManagerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TeamManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TeamManagerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TeamManagerFutureStub>() {
        @java.lang.Override
        public TeamManagerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TeamManagerFutureStub(channel, callOptions);
        }
      };
    return TeamManagerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getTeamManager(org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTeamManagerMethod(), responseObserver);
    }

    /**
     */
    default void getTeamManagers(org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTeamManagersMethod(), responseObserver);
    }

    /**
     */
    default void createTeamManager(org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTeamManagerMethod(), responseObserver);
    }

    /**
     */
    default void updateTeamManager(org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTeamManagerMethod(), responseObserver);
    }

    /**
     */
    default void deleteTeamManager(org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTeamManagerMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TeamManager.
   */
  public static abstract class TeamManagerImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TeamManagerGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TeamManager.
   */
  public static final class TeamManagerStub
      extends io.grpc.stub.AbstractAsyncStub<TeamManagerStub> {
    private TeamManagerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamManagerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TeamManagerStub(channel, callOptions);
    }

    /**
     */
    public void getTeamManager(org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTeamManagerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTeamManagers(org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTeamManagersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTeamManager(org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTeamManagerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTeamManager(org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTeamManagerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTeamManager(org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTeamManagerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TeamManager.
   */
  public static final class TeamManagerBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TeamManagerBlockingStub> {
    private TeamManagerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamManagerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TeamManagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerResponse getTeamManager(org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTeamManagerMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersResponse getTeamManagers(org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTeamManagersMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerResponse createTeamManager(org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTeamManagerMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerResponse updateTeamManager(org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTeamManagerMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerResponse deleteTeamManager(org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTeamManagerMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TeamManager.
   */
  public static final class TeamManagerFutureStub
      extends io.grpc.stub.AbstractFutureStub<TeamManagerFutureStub> {
    private TeamManagerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamManagerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TeamManagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerResponse> getTeamManager(
        org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTeamManagerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersResponse> getTeamManagers(
        org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTeamManagersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerResponse> createTeamManager(
        org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTeamManagerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerResponse> updateTeamManager(
        org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTeamManagerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerResponse> deleteTeamManager(
        org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTeamManagerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TEAM_MANAGER = 0;
  private static final int METHODID_GET_TEAM_MANAGERS = 1;
  private static final int METHODID_CREATE_TEAM_MANAGER = 2;
  private static final int METHODID_UPDATE_TEAM_MANAGER = 3;
  private static final int METHODID_DELETE_TEAM_MANAGER = 4;

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
        case METHODID_GET_TEAM_MANAGER:
          serviceImpl.getTeamManager((org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerResponse>) responseObserver);
          break;
        case METHODID_GET_TEAM_MANAGERS:
          serviceImpl.getTeamManagers((org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersResponse>) responseObserver);
          break;
        case METHODID_CREATE_TEAM_MANAGER:
          serviceImpl.createTeamManager((org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TEAM_MANAGER:
          serviceImpl.updateTeamManager((org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerResponse>) responseObserver);
          break;
        case METHODID_DELETE_TEAM_MANAGER:
          serviceImpl.deleteTeamManager((org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerResponse>) responseObserver);
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
          getGetTeamManagerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerRequest,
              org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagerResponse>(
                service, METHODID_GET_TEAM_MANAGER)))
        .addMethod(
          getGetTeamManagersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersRequest,
              org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.GetTeamManagersResponse>(
                service, METHODID_GET_TEAM_MANAGERS)))
        .addMethod(
          getCreateTeamManagerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerRequest,
              org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.CreateTeamManagerResponse>(
                service, METHODID_CREATE_TEAM_MANAGER)))
        .addMethod(
          getUpdateTeamManagerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerRequest,
              org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.UpdateTeamManagerResponse>(
                service, METHODID_UPDATE_TEAM_MANAGER)))
        .addMethod(
          getDeleteTeamManagerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerRequest,
              org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.DeleteTeamManagerResponse>(
                service, METHODID_DELETE_TEAM_MANAGER)))
        .build();
  }

  private static abstract class TeamManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TeamManagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.apigateway.grpc.teamManager.TeamManagerOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TeamManager");
    }
  }

  private static final class TeamManagerFileDescriptorSupplier
      extends TeamManagerBaseDescriptorSupplier {
    TeamManagerFileDescriptorSupplier() {}
  }

  private static final class TeamManagerMethodDescriptorSupplier
      extends TeamManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TeamManagerMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TeamManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TeamManagerFileDescriptorSupplier())
              .addMethod(getGetTeamManagerMethod())
              .addMethod(getGetTeamManagersMethod())
              .addMethod(getCreateTeamManagerMethod())
              .addMethod(getUpdateTeamManagerMethod())
              .addMethod(getDeleteTeamManagerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
