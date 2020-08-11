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
    comments = "Source: iotAgent.proto")
public final class IotAgentServiceGrpc {

  private IotAgentServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.IotAgentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.IotAgentOuterClass.AddIotAgentRequest,
      com.google.protobuf.Empty> getAddIotAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddIotAgent",
      requestType = proto.IotAgentOuterClass.AddIotAgentRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.IotAgentOuterClass.AddIotAgentRequest,
      com.google.protobuf.Empty> getAddIotAgentMethod() {
    io.grpc.MethodDescriptor<proto.IotAgentOuterClass.AddIotAgentRequest, com.google.protobuf.Empty> getAddIotAgentMethod;
    if ((getAddIotAgentMethod = IotAgentServiceGrpc.getAddIotAgentMethod) == null) {
      synchronized (IotAgentServiceGrpc.class) {
        if ((getAddIotAgentMethod = IotAgentServiceGrpc.getAddIotAgentMethod) == null) {
          IotAgentServiceGrpc.getAddIotAgentMethod = getAddIotAgentMethod =
              io.grpc.MethodDescriptor.<proto.IotAgentOuterClass.AddIotAgentRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddIotAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.IotAgentOuterClass.AddIotAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IotAgentServiceMethodDescriptorSupplier("AddIotAgent"))
              .build();
        }
      }
    }
    return getAddIotAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      proto.IotAgentOuterClass.ListIotAgentsResponse> getListIotAgentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListIotAgents",
      requestType = com.google.protobuf.Empty.class,
      responseType = proto.IotAgentOuterClass.ListIotAgentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      proto.IotAgentOuterClass.ListIotAgentsResponse> getListIotAgentsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, proto.IotAgentOuterClass.ListIotAgentsResponse> getListIotAgentsMethod;
    if ((getListIotAgentsMethod = IotAgentServiceGrpc.getListIotAgentsMethod) == null) {
      synchronized (IotAgentServiceGrpc.class) {
        if ((getListIotAgentsMethod = IotAgentServiceGrpc.getListIotAgentsMethod) == null) {
          IotAgentServiceGrpc.getListIotAgentsMethod = getListIotAgentsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, proto.IotAgentOuterClass.ListIotAgentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListIotAgents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.IotAgentOuterClass.ListIotAgentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IotAgentServiceMethodDescriptorSupplier("ListIotAgents"))
              .build();
        }
      }
    }
    return getListIotAgentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.IotAgentOuterClass.GetIotAgentWithProtocolRequest,
      proto.IotAgentOuterClass.GetIotAgentWithProtocolResponse> getGetIotAgentWithProtocolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIotAgentWithProtocol",
      requestType = proto.IotAgentOuterClass.GetIotAgentWithProtocolRequest.class,
      responseType = proto.IotAgentOuterClass.GetIotAgentWithProtocolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.IotAgentOuterClass.GetIotAgentWithProtocolRequest,
      proto.IotAgentOuterClass.GetIotAgentWithProtocolResponse> getGetIotAgentWithProtocolMethod() {
    io.grpc.MethodDescriptor<proto.IotAgentOuterClass.GetIotAgentWithProtocolRequest, proto.IotAgentOuterClass.GetIotAgentWithProtocolResponse> getGetIotAgentWithProtocolMethod;
    if ((getGetIotAgentWithProtocolMethod = IotAgentServiceGrpc.getGetIotAgentWithProtocolMethod) == null) {
      synchronized (IotAgentServiceGrpc.class) {
        if ((getGetIotAgentWithProtocolMethod = IotAgentServiceGrpc.getGetIotAgentWithProtocolMethod) == null) {
          IotAgentServiceGrpc.getGetIotAgentWithProtocolMethod = getGetIotAgentWithProtocolMethod =
              io.grpc.MethodDescriptor.<proto.IotAgentOuterClass.GetIotAgentWithProtocolRequest, proto.IotAgentOuterClass.GetIotAgentWithProtocolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIotAgentWithProtocol"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.IotAgentOuterClass.GetIotAgentWithProtocolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.IotAgentOuterClass.GetIotAgentWithProtocolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IotAgentServiceMethodDescriptorSupplier("GetIotAgentWithProtocol"))
              .build();
        }
      }
    }
    return getGetIotAgentWithProtocolMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IotAgentServiceStub newStub(io.grpc.Channel channel) {
    return new IotAgentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IotAgentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IotAgentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IotAgentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IotAgentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class IotAgentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addIotAgent(proto.IotAgentOuterClass.AddIotAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getAddIotAgentMethod(), responseObserver);
    }

    /**
     */
    public void listIotAgents(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<proto.IotAgentOuterClass.ListIotAgentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListIotAgentsMethod(), responseObserver);
    }

    /**
     */
    public void getIotAgentWithProtocol(proto.IotAgentOuterClass.GetIotAgentWithProtocolRequest request,
        io.grpc.stub.StreamObserver<proto.IotAgentOuterClass.GetIotAgentWithProtocolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetIotAgentWithProtocolMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddIotAgentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.IotAgentOuterClass.AddIotAgentRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ADD_IOT_AGENT)))
          .addMethod(
            getListIotAgentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                proto.IotAgentOuterClass.ListIotAgentsResponse>(
                  this, METHODID_LIST_IOT_AGENTS)))
          .addMethod(
            getGetIotAgentWithProtocolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.IotAgentOuterClass.GetIotAgentWithProtocolRequest,
                proto.IotAgentOuterClass.GetIotAgentWithProtocolResponse>(
                  this, METHODID_GET_IOT_AGENT_WITH_PROTOCOL)))
          .build();
    }
  }

  /**
   */
  public static final class IotAgentServiceStub extends io.grpc.stub.AbstractStub<IotAgentServiceStub> {
    private IotAgentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IotAgentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IotAgentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IotAgentServiceStub(channel, callOptions);
    }

    /**
     */
    public void addIotAgent(proto.IotAgentOuterClass.AddIotAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddIotAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listIotAgents(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<proto.IotAgentOuterClass.ListIotAgentsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListIotAgentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIotAgentWithProtocol(proto.IotAgentOuterClass.GetIotAgentWithProtocolRequest request,
        io.grpc.stub.StreamObserver<proto.IotAgentOuterClass.GetIotAgentWithProtocolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetIotAgentWithProtocolMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IotAgentServiceBlockingStub extends io.grpc.stub.AbstractStub<IotAgentServiceBlockingStub> {
    private IotAgentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IotAgentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IotAgentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IotAgentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty addIotAgent(proto.IotAgentOuterClass.AddIotAgentRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddIotAgentMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.IotAgentOuterClass.ListIotAgentsResponse listIotAgents(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListIotAgentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.IotAgentOuterClass.GetIotAgentWithProtocolResponse getIotAgentWithProtocol(proto.IotAgentOuterClass.GetIotAgentWithProtocolRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetIotAgentWithProtocolMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IotAgentServiceFutureStub extends io.grpc.stub.AbstractStub<IotAgentServiceFutureStub> {
    private IotAgentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IotAgentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IotAgentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IotAgentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addIotAgent(
        proto.IotAgentOuterClass.AddIotAgentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddIotAgentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.IotAgentOuterClass.ListIotAgentsResponse> listIotAgents(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListIotAgentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.IotAgentOuterClass.GetIotAgentWithProtocolResponse> getIotAgentWithProtocol(
        proto.IotAgentOuterClass.GetIotAgentWithProtocolRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetIotAgentWithProtocolMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_IOT_AGENT = 0;
  private static final int METHODID_LIST_IOT_AGENTS = 1;
  private static final int METHODID_GET_IOT_AGENT_WITH_PROTOCOL = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IotAgentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IotAgentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_IOT_AGENT:
          serviceImpl.addIotAgent((proto.IotAgentOuterClass.AddIotAgentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_IOT_AGENTS:
          serviceImpl.listIotAgents((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<proto.IotAgentOuterClass.ListIotAgentsResponse>) responseObserver);
          break;
        case METHODID_GET_IOT_AGENT_WITH_PROTOCOL:
          serviceImpl.getIotAgentWithProtocol((proto.IotAgentOuterClass.GetIotAgentWithProtocolRequest) request,
              (io.grpc.stub.StreamObserver<proto.IotAgentOuterClass.GetIotAgentWithProtocolResponse>) responseObserver);
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

  private static abstract class IotAgentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IotAgentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.IotAgentOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IotAgentService");
    }
  }

  private static final class IotAgentServiceFileDescriptorSupplier
      extends IotAgentServiceBaseDescriptorSupplier {
    IotAgentServiceFileDescriptorSupplier() {}
  }

  private static final class IotAgentServiceMethodDescriptorSupplier
      extends IotAgentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IotAgentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IotAgentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IotAgentServiceFileDescriptorSupplier())
              .addMethod(getAddIotAgentMethod())
              .addMethod(getListIotAgentsMethod())
              .addMethod(getGetIotAgentWithProtocolMethod())
              .build();
        }
      }
    }
    return result;
  }
}
