package de.fiwareManager

import de.fiwareManager.JWTManagerServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for de.fiwareManager.JWTManagerService.
 */
object JWTManagerServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = JWTManagerServiceGrpc.getServiceDescriptor()

  val generateJWTMethod: MethodDescriptor<GenerateJWTRequest, GenerateJWTResponse>
    @JvmStatic
    get() = JWTManagerServiceGrpc.getGenerateJWTMethod()

  /**
   * A stub for issuing RPCs to a(n) de.fiwareManager.JWTManagerService service as suspending
   * coroutines.
   */
  @StubFor(JWTManagerServiceGrpc::class)
  class JWTManagerServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<JWTManagerServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): JWTManagerServiceCoroutineStub =
        JWTManagerServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun generateJWT(request: GenerateJWTRequest): GenerateJWTResponse = unaryRpc(
      channel,
      JWTManagerServiceGrpc.getGenerateJWTMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the de.fiwareManager.JWTManagerService service based on Kotlin
   * coroutines.
   */
  abstract class JWTManagerServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for de.fiwareManager.JWTManagerService.GenerateJWT.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun generateJWT(request: GenerateJWTRequest): GenerateJWTResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method de.fiwareManager.JWTManagerService.GenerateJWT is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = JWTManagerServiceGrpc.getGenerateJWTMethod(),
      implementation = ::generateJWT
    )).build()
  }
}
