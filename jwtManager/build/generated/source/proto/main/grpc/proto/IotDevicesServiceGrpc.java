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
    comments = "Source: iotDevice.proto")
public final class IotDevicesServiceGrpc {

  private IotDevicesServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.IotDevicesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.IotDeviceOuterClass.DeleteIotDeviceRequest,
      com.google.protobuf.Empty> getDeleteIotDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteIotDevice",
      requestType = proto.IotDeviceOuterClass.DeleteIotDeviceRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.IotDeviceOuterClass.DeleteIotDeviceRequest,
      com.google.protobuf.Empty> getDeleteIotDeviceMethod() {
    io.grpc.MethodDescriptor<proto.IotDeviceOuterClass.DeleteIotDeviceRequest, com.google.protobuf.Empty> getDeleteIotDeviceMethod;
    if ((getDeleteIotDeviceMethod = IotDevicesServiceGrpc.getDeleteIotDeviceMethod) == null) {
      synchronized (IotDevicesServiceGrpc.class) {
        if ((getDeleteIotDeviceMethod = IotDevicesServiceGrpc.getDeleteIotDeviceMethod) == null) {
          IotDevicesServiceGrpc.getDeleteIotDeviceMethod = getDeleteIotDeviceMethod =
              io.grpc.MethodDescriptor.<proto.IotDeviceOuterClass.DeleteIotDeviceRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteIotDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.IotDeviceOuterClass.DeleteIotDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IotDevicesServiceMethodDescriptorSupplier("DeleteIotDevice"))
              .build();
        }
      }
    }
    return getDeleteIotDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.IotDeviceOuterClass.CreateIotDeviceRequest,
      com.google.protobuf.Empty> getCreateIotDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateIotDevice",
      requestType = proto.IotDeviceOuterClass.CreateIotDeviceRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.IotDeviceOuterClass.CreateIotDeviceRequest,
      com.google.protobuf.Empty> getCreateIotDeviceMethod() {
    io.grpc.MethodDescriptor<proto.IotDeviceOuterClass.CreateIotDeviceRequest, com.google.protobuf.Empty> getCreateIotDeviceMethod;
    if ((getCreateIotDeviceMethod = IotDevicesServiceGrpc.getCreateIotDeviceMethod) == null) {
      synchronized (IotDevicesServiceGrpc.class) {
        if ((getCreateIotDeviceMethod = IotDevicesServiceGrpc.getCreateIotDeviceMethod) == null) {
          IotDevicesServiceGrpc.getCreateIotDeviceMethod = getCreateIotDeviceMethod =
              io.grpc.MethodDescriptor.<proto.IotDeviceOuterClass.CreateIotDeviceRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateIotDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.IotDeviceOuterClass.CreateIotDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IotDevicesServiceMethodDescriptorSupplier("CreateIotDevice"))
              .build();
        }
      }
    }
    return getCreateIotDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      proto.IotDeviceOuterClass.ListIotDevicesResponse> getListIotDevicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListIotDevices",
      requestType = com.google.protobuf.Empty.class,
      responseType = proto.IotDeviceOuterClass.ListIotDevicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      proto.IotDeviceOuterClass.ListIotDevicesResponse> getListIotDevicesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, proto.IotDeviceOuterClass.ListIotDevicesResponse> getListIotDevicesMethod;
    if ((getListIotDevicesMethod = IotDevicesServiceGrpc.getListIotDevicesMethod) == null) {
      synchronized (IotDevicesServiceGrpc.class) {
        if ((getListIotDevicesMethod = IotDevicesServiceGrpc.getListIotDevicesMethod) == null) {
          IotDevicesServiceGrpc.getListIotDevicesMethod = getListIotDevicesMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, proto.IotDeviceOuterClass.ListIotDevicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListIotDevices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.IotDeviceOuterClass.ListIotDevicesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IotDevicesServiceMethodDescriptorSupplier("ListIotDevices"))
              .build();
        }
      }
    }
    return getListIotDevicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.IotDeviceOuterClass.UpdateIotDeviceRequest,
      com.google.protobuf.Empty> getUpdateIotDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateIotDevice",
      requestType = proto.IotDeviceOuterClass.UpdateIotDeviceRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.IotDeviceOuterClass.UpdateIotDeviceRequest,
      com.google.protobuf.Empty> getUpdateIotDeviceMethod() {
    io.grpc.MethodDescriptor<proto.IotDeviceOuterClass.UpdateIotDeviceRequest, com.google.protobuf.Empty> getUpdateIotDeviceMethod;
    if ((getUpdateIotDeviceMethod = IotDevicesServiceGrpc.getUpdateIotDeviceMethod) == null) {
      synchronized (IotDevicesServiceGrpc.class) {
        if ((getUpdateIotDeviceMethod = IotDevicesServiceGrpc.getUpdateIotDeviceMethod) == null) {
          IotDevicesServiceGrpc.getUpdateIotDeviceMethod = getUpdateIotDeviceMethod =
              io.grpc.MethodDescriptor.<proto.IotDeviceOuterClass.UpdateIotDeviceRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateIotDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.IotDeviceOuterClass.UpdateIotDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IotDevicesServiceMethodDescriptorSupplier("UpdateIotDevice"))
              .build();
        }
      }
    }
    return getUpdateIotDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.IotDeviceOuterClass.IotDeviceRequest,
      proto.IotDeviceOuterClass.IotDeviceResponse> getIotDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IotDevice",
      requestType = proto.IotDeviceOuterClass.IotDeviceRequest.class,
      responseType = proto.IotDeviceOuterClass.IotDeviceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.IotDeviceOuterClass.IotDeviceRequest,
      proto.IotDeviceOuterClass.IotDeviceResponse> getIotDeviceMethod() {
    io.grpc.MethodDescriptor<proto.IotDeviceOuterClass.IotDeviceRequest, proto.IotDeviceOuterClass.IotDeviceResponse> getIotDeviceMethod;
    if ((getIotDeviceMethod = IotDevicesServiceGrpc.getIotDeviceMethod) == null) {
      synchronized (IotDevicesServiceGrpc.class) {
        if ((getIotDeviceMethod = IotDevicesServiceGrpc.getIotDeviceMethod) == null) {
          IotDevicesServiceGrpc.getIotDeviceMethod = getIotDeviceMethod =
              io.grpc.MethodDescriptor.<proto.IotDeviceOuterClass.IotDeviceRequest, proto.IotDeviceOuterClass.IotDeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IotDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.IotDeviceOuterClass.IotDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.IotDeviceOuterClass.IotDeviceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IotDevicesServiceMethodDescriptorSupplier("IotDevice"))
              .build();
        }
      }
    }
    return getIotDeviceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IotDevicesServiceStub newStub(io.grpc.Channel channel) {
    return new IotDevicesServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IotDevicesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IotDevicesServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IotDevicesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IotDevicesServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class IotDevicesServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void deleteIotDevice(proto.IotDeviceOuterClass.DeleteIotDeviceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteIotDeviceMethod(), responseObserver);
    }

    /**
     */
    public void createIotDevice(proto.IotDeviceOuterClass.CreateIotDeviceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateIotDeviceMethod(), responseObserver);
    }

    /**
     */
    public void listIotDevices(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<proto.IotDeviceOuterClass.ListIotDevicesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListIotDevicesMethod(), responseObserver);
    }

    /**
     */
    public void updateIotDevice(proto.IotDeviceOuterClass.UpdateIotDeviceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateIotDeviceMethod(), responseObserver);
    }

    /**
     */
    public void iotDevice(proto.IotDeviceOuterClass.IotDeviceRequest request,
        io.grpc.stub.StreamObserver<proto.IotDeviceOuterClass.IotDeviceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIotDeviceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDeleteIotDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.IotDeviceOuterClass.DeleteIotDeviceRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_IOT_DEVICE)))
          .addMethod(
            getCreateIotDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.IotDeviceOuterClass.CreateIotDeviceRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_CREATE_IOT_DEVICE)))
          .addMethod(
            getListIotDevicesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                proto.IotDeviceOuterClass.ListIotDevicesResponse>(
                  this, METHODID_LIST_IOT_DEVICES)))
          .addMethod(
            getUpdateIotDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.IotDeviceOuterClass.UpdateIotDeviceRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_IOT_DEVICE)))
          .addMethod(
            getIotDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.IotDeviceOuterClass.IotDeviceRequest,
                proto.IotDeviceOuterClass.IotDeviceResponse>(
                  this, METHODID_IOT_DEVICE)))
          .build();
    }
  }

  /**
   */
  public static final class IotDevicesServiceStub extends io.grpc.stub.AbstractStub<IotDevicesServiceStub> {
    private IotDevicesServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IotDevicesServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IotDevicesServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IotDevicesServiceStub(channel, callOptions);
    }

    /**
     */
    public void deleteIotDevice(proto.IotDeviceOuterClass.DeleteIotDeviceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteIotDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createIotDevice(proto.IotDeviceOuterClass.CreateIotDeviceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateIotDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listIotDevices(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<proto.IotDeviceOuterClass.ListIotDevicesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListIotDevicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateIotDevice(proto.IotDeviceOuterClass.UpdateIotDeviceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateIotDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void iotDevice(proto.IotDeviceOuterClass.IotDeviceRequest request,
        io.grpc.stub.StreamObserver<proto.IotDeviceOuterClass.IotDeviceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIotDeviceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IotDevicesServiceBlockingStub extends io.grpc.stub.AbstractStub<IotDevicesServiceBlockingStub> {
    private IotDevicesServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IotDevicesServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IotDevicesServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IotDevicesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty deleteIotDevice(proto.IotDeviceOuterClass.DeleteIotDeviceRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteIotDeviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty createIotDevice(proto.IotDeviceOuterClass.CreateIotDeviceRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateIotDeviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.IotDeviceOuterClass.ListIotDevicesResponse listIotDevices(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListIotDevicesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateIotDevice(proto.IotDeviceOuterClass.UpdateIotDeviceRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateIotDeviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.IotDeviceOuterClass.IotDeviceResponse iotDevice(proto.IotDeviceOuterClass.IotDeviceRequest request) {
      return blockingUnaryCall(
          getChannel(), getIotDeviceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IotDevicesServiceFutureStub extends io.grpc.stub.AbstractStub<IotDevicesServiceFutureStub> {
    private IotDevicesServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IotDevicesServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IotDevicesServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IotDevicesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteIotDevice(
        proto.IotDeviceOuterClass.DeleteIotDeviceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteIotDeviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createIotDevice(
        proto.IotDeviceOuterClass.CreateIotDeviceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateIotDeviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.IotDeviceOuterClass.ListIotDevicesResponse> listIotDevices(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListIotDevicesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateIotDevice(
        proto.IotDeviceOuterClass.UpdateIotDeviceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateIotDeviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.IotDeviceOuterClass.IotDeviceResponse> iotDevice(
        proto.IotDeviceOuterClass.IotDeviceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIotDeviceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELETE_IOT_DEVICE = 0;
  private static final int METHODID_CREATE_IOT_DEVICE = 1;
  private static final int METHODID_LIST_IOT_DEVICES = 2;
  private static final int METHODID_UPDATE_IOT_DEVICE = 3;
  private static final int METHODID_IOT_DEVICE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IotDevicesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IotDevicesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DELETE_IOT_DEVICE:
          serviceImpl.deleteIotDevice((proto.IotDeviceOuterClass.DeleteIotDeviceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_IOT_DEVICE:
          serviceImpl.createIotDevice((proto.IotDeviceOuterClass.CreateIotDeviceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_IOT_DEVICES:
          serviceImpl.listIotDevices((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<proto.IotDeviceOuterClass.ListIotDevicesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_IOT_DEVICE:
          serviceImpl.updateIotDevice((proto.IotDeviceOuterClass.UpdateIotDeviceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_IOT_DEVICE:
          serviceImpl.iotDevice((proto.IotDeviceOuterClass.IotDeviceRequest) request,
              (io.grpc.stub.StreamObserver<proto.IotDeviceOuterClass.IotDeviceResponse>) responseObserver);
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

  private static abstract class IotDevicesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IotDevicesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.IotDeviceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IotDevicesService");
    }
  }

  private static final class IotDevicesServiceFileDescriptorSupplier
      extends IotDevicesServiceBaseDescriptorSupplier {
    IotDevicesServiceFileDescriptorSupplier() {}
  }

  private static final class IotDevicesServiceMethodDescriptorSupplier
      extends IotDevicesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IotDevicesServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IotDevicesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IotDevicesServiceFileDescriptorSupplier())
              .addMethod(getDeleteIotDeviceMethod())
              .addMethod(getCreateIotDeviceMethod())
              .addMethod(getListIotDevicesMethod())
              .addMethod(getUpdateIotDeviceMethod())
              .addMethod(getIotDeviceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
