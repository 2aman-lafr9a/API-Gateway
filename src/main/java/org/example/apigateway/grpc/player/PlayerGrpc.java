package org.example.apigateway.grpc.player;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: player.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PlayerGrpc {

  private PlayerGrpc() {}

  public static final java.lang.String SERVICE_NAME = "player.Player";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerRequest,
      org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerResponse> getGetPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayer",
      requestType = org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerRequest.class,
      responseType = org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerRequest,
      org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerResponse> getGetPlayerMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerRequest, org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerResponse> getGetPlayerMethod;
    if ((getGetPlayerMethod = PlayerGrpc.getGetPlayerMethod) == null) {
      synchronized (PlayerGrpc.class) {
        if ((getGetPlayerMethod = PlayerGrpc.getGetPlayerMethod) == null) {
          PlayerGrpc.getGetPlayerMethod = getGetPlayerMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerRequest, org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerMethodDescriptorSupplier("GetPlayer"))
              .build();
        }
      }
    }
    return getGetPlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerRequest,
      org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerResponse> getCreatePlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePlayer",
      requestType = org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerRequest.class,
      responseType = org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerRequest,
      org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerResponse> getCreatePlayerMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerRequest, org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerResponse> getCreatePlayerMethod;
    if ((getCreatePlayerMethod = PlayerGrpc.getCreatePlayerMethod) == null) {
      synchronized (PlayerGrpc.class) {
        if ((getCreatePlayerMethod = PlayerGrpc.getCreatePlayerMethod) == null) {
          PlayerGrpc.getCreatePlayerMethod = getCreatePlayerMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerRequest, org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerMethodDescriptorSupplier("CreatePlayer"))
              .build();
        }
      }
    }
    return getCreatePlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerRequest,
      org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerResponse> getUpdatePlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePlayer",
      requestType = org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerRequest.class,
      responseType = org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerRequest,
      org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerResponse> getUpdatePlayerMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerRequest, org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerResponse> getUpdatePlayerMethod;
    if ((getUpdatePlayerMethod = PlayerGrpc.getUpdatePlayerMethod) == null) {
      synchronized (PlayerGrpc.class) {
        if ((getUpdatePlayerMethod = PlayerGrpc.getUpdatePlayerMethod) == null) {
          PlayerGrpc.getUpdatePlayerMethod = getUpdatePlayerMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerRequest, org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerMethodDescriptorSupplier("UpdatePlayer"))
              .build();
        }
      }
    }
    return getUpdatePlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerRequest,
      org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerResponse> getDeletePlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePlayer",
      requestType = org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerRequest.class,
      responseType = org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerRequest,
      org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerResponse> getDeletePlayerMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerRequest, org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerResponse> getDeletePlayerMethod;
    if ((getDeletePlayerMethod = PlayerGrpc.getDeletePlayerMethod) == null) {
      synchronized (PlayerGrpc.class) {
        if ((getDeletePlayerMethod = PlayerGrpc.getDeletePlayerMethod) == null) {
          PlayerGrpc.getDeletePlayerMethod = getDeletePlayerMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerRequest, org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerMethodDescriptorSupplier("DeletePlayer"))
              .build();
        }
      }
    }
    return getDeletePlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersRequest,
      org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersResponse> getGetPlayersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayers",
      requestType = org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersRequest.class,
      responseType = org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersRequest,
      org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersResponse> getGetPlayersMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersRequest, org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersResponse> getGetPlayersMethod;
    if ((getGetPlayersMethod = PlayerGrpc.getGetPlayersMethod) == null) {
      synchronized (PlayerGrpc.class) {
        if ((getGetPlayersMethod = PlayerGrpc.getGetPlayersMethod) == null) {
          PlayerGrpc.getGetPlayersMethod = getGetPlayersMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersRequest, org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerMethodDescriptorSupplier("GetPlayers"))
              .build();
        }
      }
    }
    return getGetPlayersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerRequest,
      org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerResponse> getGetOffersByPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOffersByPlayer",
      requestType = org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerRequest.class,
      responseType = org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerRequest,
      org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerResponse> getGetOffersByPlayerMethod() {
    io.grpc.MethodDescriptor<org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerRequest, org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerResponse> getGetOffersByPlayerMethod;
    if ((getGetOffersByPlayerMethod = PlayerGrpc.getGetOffersByPlayerMethod) == null) {
      synchronized (PlayerGrpc.class) {
        if ((getGetOffersByPlayerMethod = PlayerGrpc.getGetOffersByPlayerMethod) == null) {
          PlayerGrpc.getGetOffersByPlayerMethod = getGetOffersByPlayerMethod =
              io.grpc.MethodDescriptor.<org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerRequest, org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOffersByPlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerMethodDescriptorSupplier("GetOffersByPlayer"))
              .build();
        }
      }
    }
    return getGetOffersByPlayerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PlayerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayerStub>() {
        @java.lang.Override
        public PlayerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayerStub(channel, callOptions);
        }
      };
    return PlayerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PlayerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayerBlockingStub>() {
        @java.lang.Override
        public PlayerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayerBlockingStub(channel, callOptions);
        }
      };
    return PlayerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PlayerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayerFutureStub>() {
        @java.lang.Override
        public PlayerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayerFutureStub(channel, callOptions);
        }
      };
    return PlayerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getPlayer(org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlayerMethod(), responseObserver);
    }

    /**
     */
    default void createPlayer(org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePlayerMethod(), responseObserver);
    }

    /**
     */
    default void updatePlayer(org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePlayerMethod(), responseObserver);
    }

    /**
     */
    default void deletePlayer(org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePlayerMethod(), responseObserver);
    }

    /**
     */
    default void getPlayers(org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlayersMethod(), responseObserver);
    }

    /**
     */
    default void getOffersByPlayer(org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOffersByPlayerMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Player.
   */
  public static abstract class PlayerImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PlayerGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Player.
   */
  public static final class PlayerStub
      extends io.grpc.stub.AbstractAsyncStub<PlayerStub> {
    private PlayerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayerStub(channel, callOptions);
    }

    /**
     */
    public void getPlayer(org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPlayer(org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePlayer(org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePlayer(org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlayers(org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlayersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOffersByPlayer(org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerRequest request,
        io.grpc.stub.StreamObserver<org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOffersByPlayerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Player.
   */
  public static final class PlayerBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PlayerBlockingStub> {
    private PlayerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayerBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerResponse getPlayer(org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerResponse createPlayer(org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerResponse updatePlayer(org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerResponse deletePlayer(org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersResponse getPlayers(org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlayersMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerResponse getOffersByPlayer(org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOffersByPlayerMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Player.
   */
  public static final class PlayerFutureStub
      extends io.grpc.stub.AbstractFutureStub<PlayerFutureStub> {
    private PlayerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerResponse> getPlayer(
        org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerResponse> createPlayer(
        org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePlayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerResponse> updatePlayer(
        org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePlayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerResponse> deletePlayer(
        org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePlayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersResponse> getPlayers(
        org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlayersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerResponse> getOffersByPlayer(
        org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOffersByPlayerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PLAYER = 0;
  private static final int METHODID_CREATE_PLAYER = 1;
  private static final int METHODID_UPDATE_PLAYER = 2;
  private static final int METHODID_DELETE_PLAYER = 3;
  private static final int METHODID_GET_PLAYERS = 4;
  private static final int METHODID_GET_OFFERS_BY_PLAYER = 5;

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
        case METHODID_GET_PLAYER:
          serviceImpl.getPlayer((org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerResponse>) responseObserver);
          break;
        case METHODID_CREATE_PLAYER:
          serviceImpl.createPlayer((org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PLAYER:
          serviceImpl.updatePlayer((org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerResponse>) responseObserver);
          break;
        case METHODID_DELETE_PLAYER:
          serviceImpl.deletePlayer((org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYERS:
          serviceImpl.getPlayers((org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersResponse>) responseObserver);
          break;
        case METHODID_GET_OFFERS_BY_PLAYER:
          serviceImpl.getOffersByPlayer((org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerRequest) request,
              (io.grpc.stub.StreamObserver<org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerResponse>) responseObserver);
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
          getGetPlayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerRequest,
              org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerResponse>(
                service, METHODID_GET_PLAYER)))
        .addMethod(
          getCreatePlayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerRequest,
              org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerResponse>(
                service, METHODID_CREATE_PLAYER)))
        .addMethod(
          getUpdatePlayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerRequest,
              org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerResponse>(
                service, METHODID_UPDATE_PLAYER)))
        .addMethod(
          getDeletePlayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerRequest,
              org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerResponse>(
                service, METHODID_DELETE_PLAYER)))
        .addMethod(
          getGetPlayersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersRequest,
              org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersResponse>(
                service, METHODID_GET_PLAYERS)))
        .addMethod(
          getGetOffersByPlayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerRequest,
              org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerResponse>(
                service, METHODID_GET_OFFERS_BY_PLAYER)))
        .build();
  }

  private static abstract class PlayerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PlayerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.apigateway.grpc.player.PlayerOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Player");
    }
  }

  private static final class PlayerFileDescriptorSupplier
      extends PlayerBaseDescriptorSupplier {
    PlayerFileDescriptorSupplier() {}
  }

  private static final class PlayerMethodDescriptorSupplier
      extends PlayerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PlayerMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PlayerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PlayerFileDescriptorSupplier())
              .addMethod(getGetPlayerMethod())
              .addMethod(getCreatePlayerMethod())
              .addMethod(getUpdatePlayerMethod())
              .addMethod(getDeletePlayerMethod())
              .addMethod(getGetPlayersMethod())
              .addMethod(getGetOffersByPlayerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
