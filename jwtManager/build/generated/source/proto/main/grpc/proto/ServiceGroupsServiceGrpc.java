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
    comments = "Source: serviceGroup.proto")
public final class ServiceGroupsServiceGrpc {

  private ServiceGroupsServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.ServiceGroupsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.ServiceGroupOuterClass.DeleteServiceGroupRequest,
      com.google.protobuf.Empty> getDeleteServiceGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteServiceGroup",
      requestType = proto.ServiceGroupOuterClass.DeleteServiceGroupRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ServiceGroupOuterClass.DeleteServiceGroupRequest,
      com.google.protobuf.Empty> getDeleteServiceGroupMethod() {
    io.grpc.MethodDescriptor<proto.ServiceGroupOuterClass.DeleteServiceGroupRequest, com.google.protobuf.Empty> getDeleteServiceGroupMethod;
    if ((getDeleteServiceGroupMethod = ServiceGroupsServiceGrpc.getDeleteServiceGroupMethod) == null) {
      synchronized (ServiceGroupsServiceGrpc.class) {
        if ((getDeleteServiceGroupMethod = ServiceGroupsServiceGrpc.getDeleteServiceGroupMethod) == null) {
          ServiceGroupsServiceGrpc.getDeleteServiceGroupMethod = getDeleteServiceGroupMethod =
              io.grpc.MethodDescriptor.<proto.ServiceGroupOuterClass.DeleteServiceGroupRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteServiceGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ServiceGroupOuterClass.DeleteServiceGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceGroupsServiceMethodDescriptorSupplier("DeleteServiceGroup"))
              .build();
        }
      }
    }
    return getDeleteServiceGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.ServiceGroupOuterClass.CreateServiceGroupRequest,
      com.google.protobuf.Empty> getCreateServiceGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateServiceGroup",
      requestType = proto.ServiceGroupOuterClass.CreateServiceGroupRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ServiceGroupOuterClass.CreateServiceGroupRequest,
      com.google.protobuf.Empty> getCreateServiceGroupMethod() {
    io.grpc.MethodDescriptor<proto.ServiceGroupOuterClass.CreateServiceGroupRequest, com.google.protobuf.Empty> getCreateServiceGroupMethod;
    if ((getCreateServiceGroupMethod = ServiceGroupsServiceGrpc.getCreateServiceGroupMethod) == null) {
      synchronized (ServiceGroupsServiceGrpc.class) {
        if ((getCreateServiceGroupMethod = ServiceGroupsServiceGrpc.getCreateServiceGroupMethod) == null) {
          ServiceGroupsServiceGrpc.getCreateServiceGroupMethod = getCreateServiceGroupMethod =
              io.grpc.MethodDescriptor.<proto.ServiceGroupOuterClass.CreateServiceGroupRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateServiceGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ServiceGroupOuterClass.CreateServiceGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceGroupsServiceMethodDescriptorSupplier("CreateServiceGroup"))
              .build();
        }
      }
    }
    return getCreateServiceGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      proto.ServiceGroupOuterClass.ListServiceGroupsResponse> getListServiceGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListServiceGroups",
      requestType = com.google.protobuf.Empty.class,
      responseType = proto.ServiceGroupOuterClass.ListServiceGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      proto.ServiceGroupOuterClass.ListServiceGroupsResponse> getListServiceGroupsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, proto.ServiceGroupOuterClass.ListServiceGroupsResponse> getListServiceGroupsMethod;
    if ((getListServiceGroupsMethod = ServiceGroupsServiceGrpc.getListServiceGroupsMethod) == null) {
      synchronized (ServiceGroupsServiceGrpc.class) {
        if ((getListServiceGroupsMethod = ServiceGroupsServiceGrpc.getListServiceGroupsMethod) == null) {
          ServiceGroupsServiceGrpc.getListServiceGroupsMethod = getListServiceGroupsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, proto.ServiceGroupOuterClass.ListServiceGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListServiceGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ServiceGroupOuterClass.ListServiceGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceGroupsServiceMethodDescriptorSupplier("ListServiceGroups"))
              .build();
        }
      }
    }
    return getListServiceGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.ServiceGroupOuterClass.UpdateServiceGroupRequest,
      com.google.protobuf.Empty> getUpdateServiceGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateServiceGroup",
      requestType = proto.ServiceGroupOuterClass.UpdateServiceGroupRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ServiceGroupOuterClass.UpdateServiceGroupRequest,
      com.google.protobuf.Empty> getUpdateServiceGroupMethod() {
    io.grpc.MethodDescriptor<proto.ServiceGroupOuterClass.UpdateServiceGroupRequest, com.google.protobuf.Empty> getUpdateServiceGroupMethod;
    if ((getUpdateServiceGroupMethod = ServiceGroupsServiceGrpc.getUpdateServiceGroupMethod) == null) {
      synchronized (ServiceGroupsServiceGrpc.class) {
        if ((getUpdateServiceGroupMethod = ServiceGroupsServiceGrpc.getUpdateServiceGroupMethod) == null) {
          ServiceGroupsServiceGrpc.getUpdateServiceGroupMethod = getUpdateServiceGroupMethod =
              io.grpc.MethodDescriptor.<proto.ServiceGroupOuterClass.UpdateServiceGroupRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateServiceGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ServiceGroupOuterClass.UpdateServiceGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceGroupsServiceMethodDescriptorSupplier("UpdateServiceGroup"))
              .build();
        }
      }
    }
    return getUpdateServiceGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.ServiceGroupOuterClass.ServiceGroupRequest,
      proto.ServiceGroupOuterClass.ServiceGroupResponse> getServiceGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ServiceGroup",
      requestType = proto.ServiceGroupOuterClass.ServiceGroupRequest.class,
      responseType = proto.ServiceGroupOuterClass.ServiceGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ServiceGroupOuterClass.ServiceGroupRequest,
      proto.ServiceGroupOuterClass.ServiceGroupResponse> getServiceGroupMethod() {
    io.grpc.MethodDescriptor<proto.ServiceGroupOuterClass.ServiceGroupRequest, proto.ServiceGroupOuterClass.ServiceGroupResponse> getServiceGroupMethod;
    if ((getServiceGroupMethod = ServiceGroupsServiceGrpc.getServiceGroupMethod) == null) {
      synchronized (ServiceGroupsServiceGrpc.class) {
        if ((getServiceGroupMethod = ServiceGroupsServiceGrpc.getServiceGroupMethod) == null) {
          ServiceGroupsServiceGrpc.getServiceGroupMethod = getServiceGroupMethod =
              io.grpc.MethodDescriptor.<proto.ServiceGroupOuterClass.ServiceGroupRequest, proto.ServiceGroupOuterClass.ServiceGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ServiceGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ServiceGroupOuterClass.ServiceGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ServiceGroupOuterClass.ServiceGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceGroupsServiceMethodDescriptorSupplier("ServiceGroup"))
              .build();
        }
      }
    }
    return getServiceGroupMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceGroupsServiceStub newStub(io.grpc.Channel channel) {
    return new ServiceGroupsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceGroupsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServiceGroupsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceGroupsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServiceGroupsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ServiceGroupsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void deleteServiceGroup(proto.ServiceGroupOuterClass.DeleteServiceGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteServiceGroupMethod(), responseObserver);
    }

    /**
     */
    public void createServiceGroup(proto.ServiceGroupOuterClass.CreateServiceGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateServiceGroupMethod(), responseObserver);
    }

    /**
     */
    public void listServiceGroups(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<proto.ServiceGroupOuterClass.ListServiceGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListServiceGroupsMethod(), responseObserver);
    }

    /**
     */
    public void updateServiceGroup(proto.ServiceGroupOuterClass.UpdateServiceGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateServiceGroupMethod(), responseObserver);
    }

    /**
     */
    public void serviceGroup(proto.ServiceGroupOuterClass.ServiceGroupRequest request,
        io.grpc.stub.StreamObserver<proto.ServiceGroupOuterClass.ServiceGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getServiceGroupMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDeleteServiceGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.ServiceGroupOuterClass.DeleteServiceGroupRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SERVICE_GROUP)))
          .addMethod(
            getCreateServiceGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.ServiceGroupOuterClass.CreateServiceGroupRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_CREATE_SERVICE_GROUP)))
          .addMethod(
            getListServiceGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                proto.ServiceGroupOuterClass.ListServiceGroupsResponse>(
                  this, METHODID_LIST_SERVICE_GROUPS)))
          .addMethod(
            getUpdateServiceGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.ServiceGroupOuterClass.UpdateServiceGroupRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_SERVICE_GROUP)))
          .addMethod(
            getServiceGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.ServiceGroupOuterClass.ServiceGroupRequest,
                proto.ServiceGroupOuterClass.ServiceGroupResponse>(
                  this, METHODID_SERVICE_GROUP)))
          .build();
    }
  }

  /**
   */
  public static final class ServiceGroupsServiceStub extends io.grpc.stub.AbstractStub<ServiceGroupsServiceStub> {
    private ServiceGroupsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceGroupsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceGroupsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceGroupsServiceStub(channel, callOptions);
    }

    /**
     */
    public void deleteServiceGroup(proto.ServiceGroupOuterClass.DeleteServiceGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteServiceGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createServiceGroup(proto.ServiceGroupOuterClass.CreateServiceGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateServiceGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listServiceGroups(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<proto.ServiceGroupOuterClass.ListServiceGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListServiceGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateServiceGroup(proto.ServiceGroupOuterClass.UpdateServiceGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateServiceGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serviceGroup(proto.ServiceGroupOuterClass.ServiceGroupRequest request,
        io.grpc.stub.StreamObserver<proto.ServiceGroupOuterClass.ServiceGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getServiceGroupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServiceGroupsServiceBlockingStub extends io.grpc.stub.AbstractStub<ServiceGroupsServiceBlockingStub> {
    private ServiceGroupsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceGroupsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceGroupsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceGroupsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty deleteServiceGroup(proto.ServiceGroupOuterClass.DeleteServiceGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteServiceGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty createServiceGroup(proto.ServiceGroupOuterClass.CreateServiceGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateServiceGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.ServiceGroupOuterClass.ListServiceGroupsResponse listServiceGroups(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListServiceGroupsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateServiceGroup(proto.ServiceGroupOuterClass.UpdateServiceGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateServiceGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.ServiceGroupOuterClass.ServiceGroupResponse serviceGroup(proto.ServiceGroupOuterClass.ServiceGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getServiceGroupMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServiceGroupsServiceFutureStub extends io.grpc.stub.AbstractStub<ServiceGroupsServiceFutureStub> {
    private ServiceGroupsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceGroupsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceGroupsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceGroupsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteServiceGroup(
        proto.ServiceGroupOuterClass.DeleteServiceGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteServiceGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createServiceGroup(
        proto.ServiceGroupOuterClass.CreateServiceGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateServiceGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ServiceGroupOuterClass.ListServiceGroupsResponse> listServiceGroups(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListServiceGroupsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateServiceGroup(
        proto.ServiceGroupOuterClass.UpdateServiceGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateServiceGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ServiceGroupOuterClass.ServiceGroupResponse> serviceGroup(
        proto.ServiceGroupOuterClass.ServiceGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getServiceGroupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELETE_SERVICE_GROUP = 0;
  private static final int METHODID_CREATE_SERVICE_GROUP = 1;
  private static final int METHODID_LIST_SERVICE_GROUPS = 2;
  private static final int METHODID_UPDATE_SERVICE_GROUP = 3;
  private static final int METHODID_SERVICE_GROUP = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceGroupsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceGroupsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DELETE_SERVICE_GROUP:
          serviceImpl.deleteServiceGroup((proto.ServiceGroupOuterClass.DeleteServiceGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_SERVICE_GROUP:
          serviceImpl.createServiceGroup((proto.ServiceGroupOuterClass.CreateServiceGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_SERVICE_GROUPS:
          serviceImpl.listServiceGroups((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<proto.ServiceGroupOuterClass.ListServiceGroupsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SERVICE_GROUP:
          serviceImpl.updateServiceGroup((proto.ServiceGroupOuterClass.UpdateServiceGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SERVICE_GROUP:
          serviceImpl.serviceGroup((proto.ServiceGroupOuterClass.ServiceGroupRequest) request,
              (io.grpc.stub.StreamObserver<proto.ServiceGroupOuterClass.ServiceGroupResponse>) responseObserver);
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

  private static abstract class ServiceGroupsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceGroupsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.ServiceGroupOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceGroupsService");
    }
  }

  private static final class ServiceGroupsServiceFileDescriptorSupplier
      extends ServiceGroupsServiceBaseDescriptorSupplier {
    ServiceGroupsServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceGroupsServiceMethodDescriptorSupplier
      extends ServiceGroupsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceGroupsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceGroupsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceGroupsServiceFileDescriptorSupplier())
              .addMethod(getDeleteServiceGroupMethod())
              .addMethod(getCreateServiceGroupMethod())
              .addMethod(getListServiceGroupsMethod())
              .addMethod(getUpdateServiceGroupMethod())
              .addMethod(getServiceGroupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
