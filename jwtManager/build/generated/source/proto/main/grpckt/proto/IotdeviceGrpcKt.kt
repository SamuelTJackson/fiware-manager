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
import proto.IotDevicesServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for proto.IotDevicesService.
 */
object IotDevicesServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = IotDevicesServiceGrpc.getServiceDescriptor()

  val deleteIotDeviceMethod: MethodDescriptor<Iotdevice.DeleteIotDeviceRequest, Empty>
    @JvmStatic
    get() = IotDevicesServiceGrpc.getDeleteIotDeviceMethod()

  val createIotDeviceMethod: MethodDescriptor<Iotdevice.CreateIotDeviceRequest, Empty>
    @JvmStatic
    get() = IotDevicesServiceGrpc.getCreateIotDeviceMethod()

  val listIotDevicesMethod: MethodDescriptor<Empty, Iotdevice.ListIotDevicesResponse>
    @JvmStatic
    get() = IotDevicesServiceGrpc.getListIotDevicesMethod()

  val updateIotDeviceMethod: MethodDescriptor<Iotdevice.UpdateIotDeviceRequest, Empty>
    @JvmStatic
    get() = IotDevicesServiceGrpc.getUpdateIotDeviceMethod()

  val iotDeviceMethod: MethodDescriptor<Iotdevice.IotDeviceRequest, Iotdevice.IotDeviceResponse>
    @JvmStatic
    get() = IotDevicesServiceGrpc.getIotDeviceMethod()

  /**
   * A stub for issuing RPCs to a(n) proto.IotDevicesService service as suspending coroutines.
   */
  @StubFor(IotDevicesServiceGrpc::class)
  class IotDevicesServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<IotDevicesServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): IotDevicesServiceCoroutineStub =
        IotDevicesServiceCoroutineStub(channel, callOptions)

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
    suspend fun deleteIotDevice(request: Iotdevice.DeleteIotDeviceRequest): Empty = unaryRpc(
      channel,
      IotDevicesServiceGrpc.getDeleteIotDeviceMethod(),
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
    suspend fun createIotDevice(request: Iotdevice.CreateIotDeviceRequest): Empty = unaryRpc(
      channel,
      IotDevicesServiceGrpc.getCreateIotDeviceMethod(),
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
    suspend fun listIotDevices(request: Empty): Iotdevice.ListIotDevicesResponse = unaryRpc(
      channel,
      IotDevicesServiceGrpc.getListIotDevicesMethod(),
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
    suspend fun updateIotDevice(request: Iotdevice.UpdateIotDeviceRequest): Empty = unaryRpc(
      channel,
      IotDevicesServiceGrpc.getUpdateIotDeviceMethod(),
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
    suspend fun iotDevice(request: Iotdevice.IotDeviceRequest): Iotdevice.IotDeviceResponse =
        unaryRpc(
      channel,
      IotDevicesServiceGrpc.getIotDeviceMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the proto.IotDevicesService service based on Kotlin coroutines.
   */
  abstract class IotDevicesServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for proto.IotDevicesService.DeleteIotDevice.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteIotDevice(request: Iotdevice.DeleteIotDeviceRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.IotDevicesService.DeleteIotDevice is unimplemented"))

    /**
     * Returns the response to an RPC for proto.IotDevicesService.CreateIotDevice.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createIotDevice(request: Iotdevice.CreateIotDeviceRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.IotDevicesService.CreateIotDevice is unimplemented"))

    /**
     * Returns the response to an RPC for proto.IotDevicesService.ListIotDevices.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listIotDevices(request: Empty): Iotdevice.ListIotDevicesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.IotDevicesService.ListIotDevices is unimplemented"))

    /**
     * Returns the response to an RPC for proto.IotDevicesService.UpdateIotDevice.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun updateIotDevice(request: Iotdevice.UpdateIotDeviceRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.IotDevicesService.UpdateIotDevice is unimplemented"))

    /**
     * Returns the response to an RPC for proto.IotDevicesService.IotDevice.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun iotDevice(request: Iotdevice.IotDeviceRequest): Iotdevice.IotDeviceResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.IotDevicesService.IotDevice is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IotDevicesServiceGrpc.getDeleteIotDeviceMethod(),
      implementation = ::deleteIotDevice
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IotDevicesServiceGrpc.getCreateIotDeviceMethod(),
      implementation = ::createIotDevice
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IotDevicesServiceGrpc.getListIotDevicesMethod(),
      implementation = ::listIotDevices
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IotDevicesServiceGrpc.getUpdateIotDeviceMethod(),
      implementation = ::updateIotDevice
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IotDevicesServiceGrpc.getIotDeviceMethod(),
      implementation = ::iotDevice
    )).build()
  }
}
