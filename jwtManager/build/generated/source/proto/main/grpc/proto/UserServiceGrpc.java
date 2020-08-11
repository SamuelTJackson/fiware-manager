package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: user.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.UserOuterClass.GetUserRequest,
      proto.UserOuterClass.GetUserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = proto.UserOuterClass.GetUserRequest.class,
      responseType = proto.UserOuterClass.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.UserOuterClass.GetUserRequest,
      proto.UserOuterClass.GetUserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<proto.UserOuterClass.GetUserRequest, proto.UserOuterClass.GetUserResponse> getGetUserMethod;
    if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
          UserServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<proto.UserOuterClass.GetUserRequest, proto.UserOuterClass.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.UserOuterClass.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.UserOuterClass.GetUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.UserOuterClass.AddUserRequest,
      com.google.protobuf.Empty> getAddUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUser",
      requestType = proto.UserOuterClass.AddUserRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.UserOuterClass.AddUserRequest,
      com.google.protobuf.Empty> getAddUserMethod() {
    io.grpc.MethodDescriptor<proto.UserOuterClass.AddUserRequest, com.google.protobuf.Empty> getAddUserMethod;
    if ((getAddUserMethod = UserServiceGrpc.getAddUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAddUserMethod = UserServiceGrpc.getAddUserMethod) == null) {
          UserServiceGrpc.getAddUserMethod = getAddUserMethod =
              io.grpc.MethodDescriptor.<proto.UserOuterClass.AddUserRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.UserOuterClass.AddUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AddUser"))
              .build();
        }
      }
    }
    return getAddUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.UserOuterClass.RemoveUserRequest,
      com.google.protobuf.Empty> getRemoveUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUser",
      requestType = proto.UserOuterClass.RemoveUserRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.UserOuterClass.RemoveUserRequest,
      com.google.protobuf.Empty> getRemoveUserMethod() {
    io.grpc.MethodDescriptor<proto.UserOuterClass.RemoveUserRequest, com.google.protobuf.Empty> getRemoveUserMethod;
    if ((getRemoveUserMethod = UserServiceGrpc.getRemoveUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRemoveUserMethod = UserServiceGrpc.getRemoveUserMethod) == null) {
          UserServiceGrpc.getRemoveUserMethod = getRemoveUserMethod =
              io.grpc.MethodDescriptor.<proto.UserOuterClass.RemoveUserRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.UserOuterClass.RemoveUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RemoveUser"))
              .build();
        }
      }
    }
    return getRemoveUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.UserOuterClass.AddLorakeyRequest,
      com.google.protobuf.Empty> getAddLorakeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddLorakey",
      requestType = proto.UserOuterClass.AddLorakeyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.UserOuterClass.AddLorakeyRequest,
      com.google.protobuf.Empty> getAddLorakeyMethod() {
    io.grpc.MethodDescriptor<proto.UserOuterClass.AddLorakeyRequest, com.google.protobuf.Empty> getAddLorakeyMethod;
    if ((getAddLorakeyMethod = UserServiceGrpc.getAddLorakeyMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAddLorakeyMethod = UserServiceGrpc.getAddLorakeyMethod) == null) {
          UserServiceGrpc.getAddLorakeyMethod = getAddLorakeyMethod =
              io.grpc.MethodDescriptor.<proto.UserOuterClass.AddLorakeyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddLorakey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.UserOuterClass.AddLorakeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AddLorakey"))
              .build();
        }
      }
    }
    return getAddLorakeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.UserOuterClass.RemoveLorakeyRequest,
      com.google.protobuf.Empty> getRemoveLorakeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveLorakey",
      requestType = proto.UserOuterClass.RemoveLorakeyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.UserOuterClass.RemoveLorakeyRequest,
      com.google.protobuf.Empty> getRemoveLorakeyMethod() {
    io.grpc.MethodDescriptor<proto.UserOuterClass.RemoveLorakeyRequest, com.google.protobuf.Empty> getRemoveLorakeyMethod;
    if ((getRemoveLorakeyMethod = UserServiceGrpc.getRemoveLorakeyMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRemoveLorakeyMethod = UserServiceGrpc.getRemoveLorakeyMethod) == null) {
          UserServiceGrpc.getRemoveLorakeyMethod = getRemoveLorakeyMethod =
              io.grpc.MethodDescriptor.<proto.UserOuterClass.RemoveLorakeyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveLorakey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.UserOuterClass.RemoveLorakeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RemoveLorakey"))
              .build();
        }
      }
    }
    return getRemoveLorakeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.UserOuterClass.GetLorakeyRequest,
      proto.UserOuterClass.GetLorakeyResponse> getGetLorakeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLorakey",
      requestType = proto.UserOuterClass.GetLorakeyRequest.class,
      responseType = proto.UserOuterClass.GetLorakeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.UserOuterClass.GetLorakeyRequest,
      proto.UserOuterClass.GetLorakeyResponse> getGetLorakeyMethod() {
    io.grpc.MethodDescriptor<proto.UserOuterClass.GetLorakeyRequest, proto.UserOuterClass.GetLorakeyResponse> getGetLorakeyMethod;
    if ((getGetLorakeyMethod = UserServiceGrpc.getGetLorakeyMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetLorakeyMethod = UserServiceGrpc.getGetLorakeyMethod) == null) {
          UserServiceGrpc.getGetLorakeyMethod = getGetLorakeyMethod =
              io.grpc.MethodDescriptor.<proto.UserOuterClass.GetLorakeyRequest, proto.UserOuterClass.GetLorakeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLorakey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.UserOuterClass.GetLorakeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.UserOuterClass.GetLorakeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetLorakey"))
              .build();
        }
      }
    }
    return getGetLorakeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.UserOuterClass.LoginUserRequest,
      proto.UserOuterClass.LoginUserResponse> getLoginUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoginUser",
      requestType = proto.UserOuterClass.LoginUserRequest.class,
      responseType = proto.UserOuterClass.LoginUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.UserOuterClass.LoginUserRequest,
      proto.UserOuterClass.LoginUserResponse> getLoginUserMethod() {
    io.grpc.MethodDescriptor<proto.UserOuterClass.LoginUserRequest, proto.UserOuterClass.LoginUserResponse> getLoginUserMethod;
    if ((getLoginUserMethod = UserServiceGrpc.getLoginUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getLoginUserMethod = UserServiceGrpc.getLoginUserMethod) == null) {
          UserServiceGrpc.getLoginUserMethod = getLoginUserMethod =
              io.grpc.MethodDescriptor.<proto.UserOuterClass.LoginUserRequest, proto.UserOuterClass.LoginUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoginUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.UserOuterClass.LoginUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.UserOuterClass.LoginUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("LoginUser"))
              .build();
        }
      }
    }
    return getLoginUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.UserOuterClass.LogoutUserRequest,
      com.google.protobuf.Empty> getLogoutUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LogoutUser",
      requestType = proto.UserOuterClass.LogoutUserRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.UserOuterClass.LogoutUserRequest,
      com.google.protobuf.Empty> getLogoutUserMethod() {
    io.grpc.MethodDescriptor<proto.UserOuterClass.LogoutUserRequest, com.google.protobuf.Empty> getLogoutUserMethod;
    if ((getLogoutUserMethod = UserServiceGrpc.getLogoutUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getLogoutUserMethod = UserServiceGrpc.getLogoutUserMethod) == null) {
          UserServiceGrpc.getLogoutUserMethod = getLogoutUserMethod =
              io.grpc.MethodDescriptor.<proto.UserOuterClass.LogoutUserRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LogoutUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.UserOuterClass.LogoutUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("LogoutUser"))
              .build();
        }
      }
    }
    return getLogoutUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUser(proto.UserOuterClass.GetUserRequest request,
        io.grpc.stub.StreamObserver<proto.UserOuterClass.GetUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    public void addUser(proto.UserOuterClass.AddUserRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserMethod(), responseObserver);
    }

    /**
     */
    public void removeUser(proto.UserOuterClass.RemoveUserRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveUserMethod(), responseObserver);
    }

    /**
     */
    public void addLorakey(proto.UserOuterClass.AddLorakeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getAddLorakeyMethod(), responseObserver);
    }

    /**
     */
    public void removeLorakey(proto.UserOuterClass.RemoveLorakeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveLorakeyMethod(), responseObserver);
    }

    /**
     */
    public void getLorakey(proto.UserOuterClass.GetLorakeyRequest request,
        io.grpc.stub.StreamObserver<proto.UserOuterClass.GetLorakeyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLorakeyMethod(), responseObserver);
    }

    /**
     */
    public void loginUser(proto.UserOuterClass.LoginUserRequest request,
        io.grpc.stub.StreamObserver<proto.UserOuterClass.LoginUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginUserMethod(), responseObserver);
    }

    /**
     */
    public void logoutUser(proto.UserOuterClass.LogoutUserRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.UserOuterClass.GetUserRequest,
                proto.UserOuterClass.GetUserResponse>(
                  this, METHODID_GET_USER)))
          .addMethod(
            getAddUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.UserOuterClass.AddUserRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ADD_USER)))
          .addMethod(
            getRemoveUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.UserOuterClass.RemoveUserRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_REMOVE_USER)))
          .addMethod(
            getAddLorakeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.UserOuterClass.AddLorakeyRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ADD_LORAKEY)))
          .addMethod(
            getRemoveLorakeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.UserOuterClass.RemoveLorakeyRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_REMOVE_LORAKEY)))
          .addMethod(
            getGetLorakeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.UserOuterClass.GetLorakeyRequest,
                proto.UserOuterClass.GetLorakeyResponse>(
                  this, METHODID_GET_LORAKEY)))
          .addMethod(
            getLoginUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.UserOuterClass.LoginUserRequest,
                proto.UserOuterClass.LoginUserResponse>(
                  this, METHODID_LOGIN_USER)))
          .addMethod(
            getLogoutUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.UserOuterClass.LogoutUserRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_LOGOUT_USER)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUser(proto.UserOuterClass.GetUserRequest request,
        io.grpc.stub.StreamObserver<proto.UserOuterClass.GetUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addUser(proto.UserOuterClass.AddUserRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeUser(proto.UserOuterClass.RemoveUserRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addLorakey(proto.UserOuterClass.AddLorakeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddLorakeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeLorakey(proto.UserOuterClass.RemoveLorakeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveLorakeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLorakey(proto.UserOuterClass.GetLorakeyRequest request,
        io.grpc.stub.StreamObserver<proto.UserOuterClass.GetLorakeyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLorakeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loginUser(proto.UserOuterClass.LoginUserRequest request,
        io.grpc.stub.StreamObserver<proto.UserOuterClass.LoginUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logoutUser(proto.UserOuterClass.LogoutUserRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.UserOuterClass.GetUserResponse getUser(proto.UserOuterClass.GetUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty addUser(proto.UserOuterClass.AddUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty removeUser(proto.UserOuterClass.RemoveUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty addLorakey(proto.UserOuterClass.AddLorakeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddLorakeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty removeLorakey(proto.UserOuterClass.RemoveLorakeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveLorakeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.UserOuterClass.GetLorakeyResponse getLorakey(proto.UserOuterClass.GetLorakeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLorakeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.UserOuterClass.LoginUserResponse loginUser(proto.UserOuterClass.LoginUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty logoutUser(proto.UserOuterClass.LogoutUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getLogoutUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.UserOuterClass.GetUserResponse> getUser(
        proto.UserOuterClass.GetUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addUser(
        proto.UserOuterClass.AddUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> removeUser(
        proto.UserOuterClass.RemoveUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addLorakey(
        proto.UserOuterClass.AddLorakeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddLorakeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> removeLorakey(
        proto.UserOuterClass.RemoveLorakeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveLorakeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.UserOuterClass.GetLorakeyResponse> getLorakey(
        proto.UserOuterClass.GetLorakeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLorakeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.UserOuterClass.LoginUserResponse> loginUser(
        proto.UserOuterClass.LoginUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> logoutUser(
        proto.UserOuterClass.LogoutUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER = 0;
  private static final int METHODID_ADD_USER = 1;
  private static final int METHODID_REMOVE_USER = 2;
  private static final int METHODID_ADD_LORAKEY = 3;
  private static final int METHODID_REMOVE_LORAKEY = 4;
  private static final int METHODID_GET_LORAKEY = 5;
  private static final int METHODID_LOGIN_USER = 6;
  private static final int METHODID_LOGOUT_USER = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER:
          serviceImpl.getUser((proto.UserOuterClass.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<proto.UserOuterClass.GetUserResponse>) responseObserver);
          break;
        case METHODID_ADD_USER:
          serviceImpl.addUser((proto.UserOuterClass.AddUserRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REMOVE_USER:
          serviceImpl.removeUser((proto.UserOuterClass.RemoveUserRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ADD_LORAKEY:
          serviceImpl.addLorakey((proto.UserOuterClass.AddLorakeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REMOVE_LORAKEY:
          serviceImpl.removeLorakey((proto.UserOuterClass.RemoveLorakeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_LORAKEY:
          serviceImpl.getLorakey((proto.UserOuterClass.GetLorakeyRequest) request,
              (io.grpc.stub.StreamObserver<proto.UserOuterClass.GetLorakeyResponse>) responseObserver);
          break;
        case METHODID_LOGIN_USER:
          serviceImpl.loginUser((proto.UserOuterClass.LoginUserRequest) request,
              (io.grpc.stub.StreamObserver<proto.UserOuterClass.LoginUserResponse>) responseObserver);
          break;
        case METHODID_LOGOUT_USER:
          serviceImpl.logoutUser((proto.UserOuterClass.LogoutUserRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.UserOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetUserMethod())
              .addMethod(getAddUserMethod())
              .addMethod(getRemoveUserMethod())
              .addMethod(getAddLorakeyMethod())
              .addMethod(getRemoveLorakeyMethod())
              .addMethod(getGetLorakeyMethod())
              .addMethod(getLoginUserMethod())
              .addMethod(getLogoutUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
