package proto

import com.google.protobuf.Empty
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import proto.ServiceGroupsServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for proto.ServiceGroupsService.
 */
object ServiceGroupsServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = ServiceGroupsServiceGrpc.getServiceDescriptor()

  val deleteServiceGroupMethod: MethodDescriptor<Servicegroup.DeleteServiceGroupRequest, Empty>
    @JvmStatic
    get() = ServiceGroupsServiceGrpc.getDeleteServiceGroupMethod()

  val createServiceGroupMethod: MethodDescriptor<Servicegroup.CreateServiceGroupRequest, Empty>
    @JvmStatic
    get() = ServiceGroupsServiceGrpc.getCreateServiceGroupMethod()

  val listServiceGroupsMethod: MethodDescriptor<Empty, Servicegroup.ListServiceGroupsResponse>
    @JvmStatic
    get() = ServiceGroupsServiceGrpc.getListServiceGroupsMethod()

  val updateServiceGroupMethod: MethodDescriptor<Servicegroup.UpdateServiceGroupRequest, Empty>
    @JvmStatic
    get() = ServiceGroupsServiceGrpc.getUpdateServiceGroupMethod()

  val serviceGroupMethod: MethodDescriptor<Servicegroup.ServiceGroupRequest,
      Servicegroup.ServiceGroupResponse>
    @JvmStatic
    get() = ServiceGroupsServiceGrpc.getServiceGroupMethod()

  /**
   * A stub for issuing RPCs to a(n) proto.ServiceGroupsService service as suspending coroutines.
   */
  @StubFor(ServiceGroupsServiceGrpc::class)
  class ServiceGroupsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<ServiceGroupsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        ServiceGroupsServiceCoroutineStub = ServiceGroupsServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun deleteServiceGroup(request: Servicegroup.DeleteServiceGroupRequest): Empty =
        unaryRpc(
      channel,
      ServiceGroupsServiceGrpc.getDeleteServiceGroupMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun createServiceGroup(request: Servicegroup.CreateServiceGroupRequest): Empty =
        unaryRpc(
      channel,
      ServiceGroupsServiceGrpc.getCreateServiceGroupMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun listServiceGroups(request: Empty): Servicegroup.ListServiceGroupsResponse =
        unaryRpc(
      channel,
      ServiceGroupsServiceGrpc.getListServiceGroupsMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun updateServiceGroup(request: Servicegroup.UpdateServiceGroupRequest): Empty =
        unaryRpc(
      channel,
      ServiceGroupsServiceGrpc.getUpdateServiceGroupMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun serviceGroup(request: Servicegroup.ServiceGroupRequest):
        Servicegroup.ServiceGroupResponse = unaryRpc(
      channel,
      ServiceGroupsServiceGrpc.getServiceGroupMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the proto.ServiceGroupsService service based on Kotlin coroutines.
   */
  abstract class ServiceGroupsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for proto.ServiceGroupsService.DeleteServiceGroup.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteServiceGroup(request: Servicegroup.DeleteServiceGroupRequest): Empty =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.ServiceGroupsService.DeleteServiceGroup is unimplemented"))

    /**
     * Returns the response to an RPC for proto.ServiceGroupsService.CreateServiceGroup.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createServiceGroup(request: Servicegroup.CreateServiceGroupRequest): Empty =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.ServiceGroupsService.CreateServiceGroup is unimplemented"))

    /**
     * Returns the response to an RPC for proto.ServiceGroupsService.ListServiceGroups.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listServiceGroups(request: Empty): Servicegroup.ListServiceGroupsResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.ServiceGroupsService.ListServiceGroups is unimplemented"))

    /**
     * Returns the response to an RPC for proto.ServiceGroupsService.UpdateServiceGroup.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun updateServiceGroup(request: Servicegroup.UpdateServiceGroupRequest): Empty =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.ServiceGroupsService.UpdateServiceGroup is unimplemented"))

    /**
     * Returns the response to an RPC for proto.ServiceGroupsService.ServiceGroup.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun serviceGroup(request: Servicegroup.ServiceGroupRequest):
        Servicegroup.ServiceGroupResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.ServiceGroupsService.ServiceGroup is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ServiceGroupsServiceGrpc.getDeleteServiceGroupMethod(),
      implementation = ::deleteServiceGroup
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ServiceGroupsServiceGrpc.getCreateServiceGroupMethod(),
      implementation = ::createServiceGroup
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ServiceGroupsServiceGrpc.getListServiceGroupsMethod(),
      implementation = ::listServiceGroups
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ServiceGroupsServiceGrpc.getUpdateServiceGroupMethod(),
      implementation = ::updateServiceGroup
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ServiceGroupsServiceGrpc.getServiceGroupMethod(),
      implementation = ::serviceGroup
    )).build()
  }
}
