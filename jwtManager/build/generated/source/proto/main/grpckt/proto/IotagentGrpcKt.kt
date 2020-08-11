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
import proto.IotAgentServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for proto.IotAgentService.
 */
object IotAgentServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = IotAgentServiceGrpc.getServiceDescriptor()

  val addIotAgentMethod: MethodDescriptor<Iotagent.AddIotAgentRequest, Empty>
    @JvmStatic
    get() = IotAgentServiceGrpc.getAddIotAgentMethod()

  val listIotAgentsMethod: MethodDescriptor<Empty, Iotagent.ListIotAgentsResponse>
    @JvmStatic
    get() = IotAgentServiceGrpc.getListIotAgentsMethod()

  val getIotAgentWithProtocolMethod: MethodDescriptor<Iotagent.GetIotAgentWithProtocolRequest,
      Iotagent.GetIotAgentWithProtocolResponse>
    @JvmStatic
    get() = IotAgentServiceGrpc.getGetIotAgentWithProtocolMethod()

  /**
   * A stub for issuing RPCs to a(n) proto.IotAgentService service as suspending coroutines.
   */
  @StubFor(IotAgentServiceGrpc::class)
  class IotAgentServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<IotAgentServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): IotAgentServiceCoroutineStub =
        IotAgentServiceCoroutineStub(channel, callOptions)

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
    suspend fun addIotAgent(request: Iotagent.AddIotAgentRequest): Empty = unaryRpc(
      channel,
      IotAgentServiceGrpc.getAddIotAgentMethod(),
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
    suspend fun listIotAgents(request: Empty): Iotagent.ListIotAgentsResponse = unaryRpc(
      channel,
      IotAgentServiceGrpc.getListIotAgentsMethod(),
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
    suspend fun getIotAgentWithProtocol(request: Iotagent.GetIotAgentWithProtocolRequest):
        Iotagent.GetIotAgentWithProtocolResponse = unaryRpc(
      channel,
      IotAgentServiceGrpc.getGetIotAgentWithProtocolMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the proto.IotAgentService service based on Kotlin coroutines.
   */
  abstract class IotAgentServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for proto.IotAgentService.AddIotAgent.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun addIotAgent(request: Iotagent.AddIotAgentRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.IotAgentService.AddIotAgent is unimplemented"))

    /**
     * Returns the response to an RPC for proto.IotAgentService.ListIotAgents.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listIotAgents(request: Empty): Iotagent.ListIotAgentsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.IotAgentService.ListIotAgents is unimplemented"))

    /**
     * Returns the response to an RPC for proto.IotAgentService.GetIotAgentWithProtocol.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getIotAgentWithProtocol(request: Iotagent.GetIotAgentWithProtocolRequest):
        Iotagent.GetIotAgentWithProtocolResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.IotAgentService.GetIotAgentWithProtocol is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IotAgentServiceGrpc.getAddIotAgentMethod(),
      implementation = ::addIotAgent
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IotAgentServiceGrpc.getListIotAgentsMethod(),
      implementation = ::listIotAgents
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IotAgentServiceGrpc.getGetIotAgentWithProtocolMethod(),
      implementation = ::getIotAgentWithProtocol
    )).build()
  }
}
