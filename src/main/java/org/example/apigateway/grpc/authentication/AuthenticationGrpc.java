package org.example.apigateway.grpc.authentication;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: authentication.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthenticationGrpc {

  private AuthenticationGrpc() {}

  public static final String SERVICE_NAME = "authentication.Authentication";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<AuthenticationOuterClass.SignUpRequest,
      AuthenticationOuterClass.SignUpResponse> getSignUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignUp",
      requestType = AuthenticationOuterClass.SignUpRequest.class,
      responseType = AuthenticationOuterClass.SignUpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AuthenticationOuterClass.SignUpRequest,
      AuthenticationOuterClass.SignUpResponse> getSignUpMethod() {
    io.grpc.MethodDescriptor<AuthenticationOuterClass.SignUpRequest, AuthenticationOuterClass.SignUpResponse> getSignUpMethod;
    if ((getSignUpMethod = AuthenticationGrpc.getSignUpMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getSignUpMethod = AuthenticationGrpc.getSignUpMethod) == null) {
          AuthenticationGrpc.getSignUpMethod = getSignUpMethod =
              io.grpc.MethodDescriptor.<AuthenticationOuterClass.SignUpRequest, AuthenticationOuterClass.SignUpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AuthenticationOuterClass.SignUpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AuthenticationOuterClass.SignUpResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("SignUp"))
              .build();
        }
      }
    }
    return getSignUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AuthenticationOuterClass.SignInRequest,
      AuthenticationOuterClass.SignInResponse> getSignInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignIn",
      requestType = AuthenticationOuterClass.SignInRequest.class,
      responseType = AuthenticationOuterClass.SignInResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AuthenticationOuterClass.SignInRequest,
      AuthenticationOuterClass.SignInResponse> getSignInMethod() {
    io.grpc.MethodDescriptor<AuthenticationOuterClass.SignInRequest, AuthenticationOuterClass.SignInResponse> getSignInMethod;
    if ((getSignInMethod = AuthenticationGrpc.getSignInMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getSignInMethod = AuthenticationGrpc.getSignInMethod) == null) {
          AuthenticationGrpc.getSignInMethod = getSignInMethod =
              io.grpc.MethodDescriptor.<AuthenticationOuterClass.SignInRequest, AuthenticationOuterClass.SignInResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AuthenticationOuterClass.SignInRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AuthenticationOuterClass.SignInResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("SignIn"))
              .build();
        }
      }
    }
    return getSignInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AuthenticationOuterClass.TokenValidationRequest,
      AuthenticationOuterClass.TokenValidationResponse> getValidateTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "validateToken",
      requestType = AuthenticationOuterClass.TokenValidationRequest.class,
      responseType = AuthenticationOuterClass.TokenValidationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AuthenticationOuterClass.TokenValidationRequest,
      AuthenticationOuterClass.TokenValidationResponse> getValidateTokenMethod() {
    io.grpc.MethodDescriptor<AuthenticationOuterClass.TokenValidationRequest, AuthenticationOuterClass.TokenValidationResponse> getValidateTokenMethod;
    if ((getValidateTokenMethod = AuthenticationGrpc.getValidateTokenMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getValidateTokenMethod = AuthenticationGrpc.getValidateTokenMethod) == null) {
          AuthenticationGrpc.getValidateTokenMethod = getValidateTokenMethod =
              io.grpc.MethodDescriptor.<AuthenticationOuterClass.TokenValidationRequest, AuthenticationOuterClass.TokenValidationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "validateToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AuthenticationOuterClass.TokenValidationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AuthenticationOuterClass.TokenValidationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("validateToken"))
              .build();
        }
      }
    }
    return getValidateTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthenticationStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthenticationStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthenticationStub>() {
        @Override
        public AuthenticationStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthenticationStub(channel, callOptions);
        }
      };
    return AuthenticationStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthenticationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthenticationBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthenticationBlockingStub>() {
        @Override
        public AuthenticationBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthenticationBlockingStub(channel, callOptions);
        }
      };
    return AuthenticationBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthenticationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthenticationFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthenticationFutureStub>() {
        @Override
        public AuthenticationFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthenticationFutureStub(channel, callOptions);
        }
      };
    return AuthenticationFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void signUp(AuthenticationOuterClass.SignUpRequest request,
                        io.grpc.stub.StreamObserver<AuthenticationOuterClass.SignUpResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignUpMethod(), responseObserver);
    }

    /**
     */
    default void signIn(AuthenticationOuterClass.SignInRequest request,
                        io.grpc.stub.StreamObserver<AuthenticationOuterClass.SignInResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignInMethod(), responseObserver);
    }

    /**
     */
    default void validateToken(AuthenticationOuterClass.TokenValidationRequest request,
                               io.grpc.stub.StreamObserver<AuthenticationOuterClass.TokenValidationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateTokenMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Authentication.
   */
  public static abstract class AuthenticationImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuthenticationGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Authentication.
   */
  public static final class AuthenticationStub
      extends io.grpc.stub.AbstractAsyncStub<AuthenticationStub> {
    private AuthenticationStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AuthenticationStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthenticationStub(channel, callOptions);
    }

    /**
     */
    public void signUp(AuthenticationOuterClass.SignUpRequest request,
                       io.grpc.stub.StreamObserver<AuthenticationOuterClass.SignUpResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signIn(AuthenticationOuterClass.SignInRequest request,
                       io.grpc.stub.StreamObserver<AuthenticationOuterClass.SignInResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateToken(AuthenticationOuterClass.TokenValidationRequest request,
                              io.grpc.stub.StreamObserver<AuthenticationOuterClass.TokenValidationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Authentication.
   */
  public static final class AuthenticationBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuthenticationBlockingStub> {
    private AuthenticationBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AuthenticationBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthenticationBlockingStub(channel, callOptions);
    }

    /**
     */
    public AuthenticationOuterClass.SignUpResponse signUp(AuthenticationOuterClass.SignUpRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignUpMethod(), getCallOptions(), request);
    }

    /**
     */
    public AuthenticationOuterClass.SignInResponse signIn(AuthenticationOuterClass.SignInRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignInMethod(), getCallOptions(), request);
    }

    /**
     */
    public AuthenticationOuterClass.TokenValidationResponse validateToken(AuthenticationOuterClass.TokenValidationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Authentication.
   */
  public static final class AuthenticationFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuthenticationFutureStub> {
    private AuthenticationFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AuthenticationFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthenticationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AuthenticationOuterClass.SignUpResponse> signUp(
        AuthenticationOuterClass.SignUpRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AuthenticationOuterClass.SignInResponse> signIn(
        AuthenticationOuterClass.SignInRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignInMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AuthenticationOuterClass.TokenValidationResponse> validateToken(
        AuthenticationOuterClass.TokenValidationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIGN_UP = 0;
  private static final int METHODID_SIGN_IN = 1;
  private static final int METHODID_VALIDATE_TOKEN = 2;

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

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIGN_UP:
          serviceImpl.signUp((AuthenticationOuterClass.SignUpRequest) request,
              (io.grpc.stub.StreamObserver<AuthenticationOuterClass.SignUpResponse>) responseObserver);
          break;
        case METHODID_SIGN_IN:
          serviceImpl.signIn((AuthenticationOuterClass.SignInRequest) request,
              (io.grpc.stub.StreamObserver<AuthenticationOuterClass.SignInResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_TOKEN:
          serviceImpl.validateToken((AuthenticationOuterClass.TokenValidationRequest) request,
              (io.grpc.stub.StreamObserver<AuthenticationOuterClass.TokenValidationResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSignUpMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              AuthenticationOuterClass.SignUpRequest,
              AuthenticationOuterClass.SignUpResponse>(
                service, METHODID_SIGN_UP)))
        .addMethod(
          getSignInMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              AuthenticationOuterClass.SignInRequest,
              AuthenticationOuterClass.SignInResponse>(
                service, METHODID_SIGN_IN)))
        .addMethod(
          getValidateTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              AuthenticationOuterClass.TokenValidationRequest,
              AuthenticationOuterClass.TokenValidationResponse>(
                service, METHODID_VALIDATE_TOKEN)))
        .build();
  }

  private static abstract class AuthenticationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthenticationBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return AuthenticationOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Authentication");
    }
  }

  private static final class AuthenticationFileDescriptorSupplier
      extends AuthenticationBaseDescriptorSupplier {
    AuthenticationFileDescriptorSupplier() {}
  }

  private static final class AuthenticationMethodDescriptorSupplier
      extends AuthenticationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthenticationMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AuthenticationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthenticationFileDescriptorSupplier())
              .addMethod(getSignUpMethod())
              .addMethod(getSignInMethod())
              .addMethod(getValidateTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
