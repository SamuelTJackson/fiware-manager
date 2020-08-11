package de.fiwareManager;

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
    comments = "Source: jwtManager.proto")
public final class JWTManagerServiceGrpc {

  private JWTManagerServiceGrpc() {}

  public static final String SERVICE_NAME = "de.fiwareManager.JWTManagerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<de.fiwareManager.GenerateJWTRequest,
      de.fiwareManager.GenerateJWTResponse> getGenerateJWTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateJWT",
      requestType = de.fiwareManager.GenerateJWTRequest.class,
      responseType = de.fiwareManager.GenerateJWTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.fiwareManager.GenerateJWTRequest,
      de.fiwareManager.GenerateJWTResponse> getGenerateJWTMethod() {
    io.grpc.MethodDescriptor<de.fiwareManager.GenerateJWTRequest, de.fiwareManager.GenerateJWTResponse> getGenerateJWTMethod;
    if ((getGenerateJWTMethod = JWTManagerServiceGrpc.getGenerateJWTMethod) == null) {
      synchronized (JWTManagerServiceGrpc.class) {
        if ((getGenerateJWTMethod = JWTManagerServiceGrpc.getGenerateJWTMethod) == null) {
          JWTManagerServiceGrpc.getGenerateJWTMethod = getGenerateJWTMethod =
              io.grpc.MethodDescriptor.<de.fiwareManager.GenerateJWTRequest, de.fiwareManager.GenerateJWTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateJWT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.fiwareManager.GenerateJWTRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.fiwareManager.GenerateJWTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JWTManagerServiceMethodDescriptorSupplier("GenerateJWT"))
              .build();
        }
      }
    }
    return getGenerateJWTMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JWTManagerServiceStub newStub(io.grpc.Channel channel) {
    return new JWTManagerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JWTManagerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JWTManagerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JWTManagerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JWTManagerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class JWTManagerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void generateJWT(de.fiwareManager.GenerateJWTRequest request,
        io.grpc.stub.StreamObserver<de.fiwareManager.GenerateJWTResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateJWTMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateJWTMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                de.fiwareManager.GenerateJWTRequest,
                de.fiwareManager.GenerateJWTResponse>(
                  this, METHODID_GENERATE_JWT)))
          .build();
    }
  }

  /**
   */
  public static final class JWTManagerServiceStub extends io.grpc.stub.AbstractStub<JWTManagerServiceStub> {
    private JWTManagerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JWTManagerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JWTManagerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JWTManagerServiceStub(channel, callOptions);
    }

    /**
     */
    public void generateJWT(de.fiwareManager.GenerateJWTRequest request,
        io.grpc.stub.StreamObserver<de.fiwareManager.GenerateJWTResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateJWTMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JWTManagerServiceBlockingStub extends io.grpc.stub.AbstractStub<JWTManagerServiceBlockingStub> {
    private JWTManagerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JWTManagerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JWTManagerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JWTManagerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public de.fiwareManager.GenerateJWTResponse generateJWT(de.fiwareManager.GenerateJWTRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateJWTMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JWTManagerServiceFutureStub extends io.grpc.stub.AbstractStub<JWTManagerServiceFutureStub> {
    private JWTManagerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JWTManagerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JWTManagerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JWTManagerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.fiwareManager.GenerateJWTResponse> generateJWT(
        de.fiwareManager.GenerateJWTRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateJWTMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_JWT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JWTManagerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JWTManagerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE_JWT:
          serviceImpl.generateJWT((de.fiwareManager.GenerateJWTRequest) request,
              (io.grpc.stub.StreamObserver<de.fiwareManager.GenerateJWTResponse>) responseObserver);
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

  private static abstract class JWTManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JWTManagerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return de.fiwareManager.JwtManager.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JWTManagerService");
    }
  }

  private static final class JWTManagerServiceFileDescriptorSupplier
      extends JWTManagerServiceBaseDescriptorSupplier {
    JWTManagerServiceFileDescriptorSupplier() {}
  }

  private static final class JWTManagerServiceMethodDescriptorSupplier
      extends JWTManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JWTManagerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (JWTManagerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JWTManagerServiceFileDescriptorSupplier())
              .addMethod(getGenerateJWTMethod())
              .build();
        }
      }
    }
    return result;
  }
}
