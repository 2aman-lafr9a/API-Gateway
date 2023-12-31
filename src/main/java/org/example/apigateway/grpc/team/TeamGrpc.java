package org.example.apigateway.grpc.team;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: team.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TeamGrpc {

  private TeamGrpc() {}

  public static final java.lang.String SERVICE_NAME = "team.Team";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamRequest,
      org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamResponse> getCreateTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTeam",
      requestType = org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamRequest.class,
      responseType = org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamRequest,
      org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamResponse> getCreateTeamMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamRequest, org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamResponse> getCreateTeamMethod;
    if ((getCreateTeamMethod = TeamGrpc.getCreateTeamMethod) == null) {
      synchronized (TeamGrpc.class) {
        if ((getCreateTeamMethod = TeamGrpc.getCreateTeamMethod) == null) {
          TeamGrpc.getCreateTeamMethod = getCreateTeamMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamRequest, org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamMethodDescriptorSupplier("CreateTeam"))
              .build();
        }
      }
    }
    return getCreateTeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.team.TeamOuterClass.GetTeamRequest,
      org.example.apigateway.grpc.team.TeamOuterClass.GetTeamResponse> getGetTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTeam",
      requestType = org.example.apigateway.grpc.team.TeamOuterClass.GetTeamRequest.class,
      responseType = org.example.apigateway.grpc.team.TeamOuterClass.GetTeamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.team.TeamOuterClass.GetTeamRequest,
      org.example.apigateway.grpc.team.TeamOuterClass.GetTeamResponse> getGetTeamMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.team.TeamOuterClass.GetTeamRequest, org.example.apigateway.grpc.team.TeamOuterClass.GetTeamResponse> getGetTeamMethod;
    if ((getGetTeamMethod = TeamGrpc.getGetTeamMethod) == null) {
      synchronized (TeamGrpc.class) {
        if ((getGetTeamMethod = TeamGrpc.getGetTeamMethod) == null) {
          TeamGrpc.getGetTeamMethod = getGetTeamMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.team.TeamOuterClass.GetTeamRequest, org.example.apigateway.grpc.team.TeamOuterClass.GetTeamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.team.TeamOuterClass.GetTeamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.team.TeamOuterClass.GetTeamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamMethodDescriptorSupplier("GetTeam"))
              .build();
        }
      }
    }
    return getGetTeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamRequest,
      org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamResponse> getUpdateTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTeam",
      requestType = org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamRequest.class,
      responseType = org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamRequest,
      org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamResponse> getUpdateTeamMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamRequest, org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamResponse> getUpdateTeamMethod;
    if ((getUpdateTeamMethod = TeamGrpc.getUpdateTeamMethod) == null) {
      synchronized (TeamGrpc.class) {
        if ((getUpdateTeamMethod = TeamGrpc.getUpdateTeamMethod) == null) {
          TeamGrpc.getUpdateTeamMethod = getUpdateTeamMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamRequest, org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamMethodDescriptorSupplier("UpdateTeam"))
              .build();
        }
      }
    }
    return getUpdateTeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamRequest,
      org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamResponse> getDeleteTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTeam",
      requestType = org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamRequest.class,
      responseType = org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamRequest,
      org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamResponse> getDeleteTeamMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamRequest, org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamResponse> getDeleteTeamMethod;
    if ((getDeleteTeamMethod = TeamGrpc.getDeleteTeamMethod) == null) {
      synchronized (TeamGrpc.class) {
        if ((getDeleteTeamMethod = TeamGrpc.getDeleteTeamMethod) == null) {
          TeamGrpc.getDeleteTeamMethod = getDeleteTeamMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamRequest, org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamMethodDescriptorSupplier("DeleteTeam"))
              .build();
        }
      }
    }
    return getDeleteTeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsRequest,
      org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsResponse> getGetTeamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTeams",
      requestType = org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsRequest.class,
      responseType = org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsRequest,
      org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsResponse> getGetTeamsMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsRequest, org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsResponse> getGetTeamsMethod;
    if ((getGetTeamsMethod = TeamGrpc.getGetTeamsMethod) == null) {
      synchronized (TeamGrpc.class) {
        if ((getGetTeamsMethod = TeamGrpc.getGetTeamsMethod) == null) {
          TeamGrpc.getGetTeamsMethod = getGetTeamsMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsRequest, org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTeams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamMethodDescriptorSupplier("GetTeams"))
              .build();
        }
      }
    }
    return getGetTeamsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TeamStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TeamStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TeamStub>() {
        @java.lang.Override
        public TeamStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TeamStub(channel, callOptions);
        }
      };
    return TeamStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TeamBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TeamBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TeamBlockingStub>() {
        @java.lang.Override
        public TeamBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TeamBlockingStub(channel, callOptions);
        }
      };
    return TeamBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TeamFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TeamFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TeamFutureStub>() {
        @java.lang.Override
        public TeamFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TeamFutureStub(channel, callOptions);
        }
      };
    return TeamFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createTeam(org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTeamMethod(), responseObserver);
    }

    /**
     */
    default void getTeam(org.example.apigateway.grpc.team.TeamOuterClass.GetTeamRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.team.TeamOuterClass.GetTeamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTeamMethod(), responseObserver);
    }

    /**
     */
    default void updateTeam(org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTeamMethod(), responseObserver);
    }

    /**
     */
    default void deleteTeam(org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTeamMethod(), responseObserver);
    }

    /**
     */
    default void getTeams(org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTeamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Team.
   */
  public static abstract class TeamImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TeamGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Team.
   */
  public static final class TeamStub
      extends io.grpc.stub.AbstractAsyncStub<TeamStub> {
    private TeamStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TeamStub(channel, callOptions);
    }

    /**
     */
    public void createTeam(org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTeam(org.example.apigateway.grpc.team.TeamOuterClass.GetTeamRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.team.TeamOuterClass.GetTeamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTeam(org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTeam(org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTeams(org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTeamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Team.
   */
  public static final class TeamBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TeamBlockingStub> {
    private TeamBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TeamBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamResponse createTeam(org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTeamMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.team.TeamOuterClass.GetTeamResponse getTeam(org.example.apigateway.grpc.team.TeamOuterClass.GetTeamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTeamMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamResponse updateTeam(org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTeamMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamResponse deleteTeam(org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTeamMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsResponse getTeams(org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTeamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Team.
   */
  public static final class TeamFutureStub
      extends io.grpc.stub.AbstractFutureStub<TeamFutureStub> {
    private TeamFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TeamFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamResponse> createTeam(
        org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTeamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.team.TeamOuterClass.GetTeamResponse> getTeam(
        org.example.apigateway.grpc.team.TeamOuterClass.GetTeamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTeamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamResponse> updateTeam(
        org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTeamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamResponse> deleteTeam(
        org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTeamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsResponse> getTeams(
        org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTeamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TEAM = 0;
  private static final int METHODID_GET_TEAM = 1;
  private static final int METHODID_UPDATE_TEAM = 2;
  private static final int METHODID_DELETE_TEAM = 3;
  private static final int METHODID_GET_TEAMS = 4;

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
        case METHODID_CREATE_TEAM:
          serviceImpl.createTeam((org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamResponse>) responseObserver);
          break;
        case METHODID_GET_TEAM:
          serviceImpl.getTeam((org.example.apigateway.grpc.team.TeamOuterClass.GetTeamRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.team.TeamOuterClass.GetTeamResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TEAM:
          serviceImpl.updateTeam((org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamResponse>) responseObserver);
          break;
        case METHODID_DELETE_TEAM:
          serviceImpl.deleteTeam((org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamResponse>) responseObserver);
          break;
        case METHODID_GET_TEAMS:
          serviceImpl.getTeams((org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsResponse>) responseObserver);
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
          getCreateTeamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamRequest,
              org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamResponse>(
                service, METHODID_CREATE_TEAM)))
        .addMethod(
          getGetTeamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.team.TeamOuterClass.GetTeamRequest,
              org.example.apigateway.grpc.team.TeamOuterClass.GetTeamResponse>(
                service, METHODID_GET_TEAM)))
        .addMethod(
          getUpdateTeamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamRequest,
              org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamResponse>(
                service, METHODID_UPDATE_TEAM)))
        .addMethod(
          getDeleteTeamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamRequest,
              org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamResponse>(
                service, METHODID_DELETE_TEAM)))
        .addMethod(
          getGetTeamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsRequest,
              org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsResponse>(
                service, METHODID_GET_TEAMS)))
        .build();
  }

  private static abstract class TeamBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TeamBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.apigateway.grpc.team.TeamOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Team");
    }
  }

  private static final class TeamFileDescriptorSupplier
      extends TeamBaseDescriptorSupplier {
    TeamFileDescriptorSupplier() {}
  }

  private static final class TeamMethodDescriptorSupplier
      extends TeamBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TeamMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TeamGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TeamFileDescriptorSupplier())
              .addMethod(getCreateTeamMethod())
              .addMethod(getGetTeamMethod())
              .addMethod(getUpdateTeamMethod())
              .addMethod(getDeleteTeamMethod())
              .addMethod(getGetTeamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
