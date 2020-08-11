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
import proto.UserServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for proto.UserService.
 */
object UserServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = UserServiceGrpc.getServiceDescriptor()

  val getUserMethod: MethodDescriptor<UserOuterClass.GetUserRequest, UserOuterClass.GetUserResponse>
    @JvmStatic
    get() = UserServiceGrpc.getGetUserMethod()

  val addUserMethod: MethodDescriptor<UserOuterClass.AddUserRequest, Empty>
    @JvmStatic
    get() = UserServiceGrpc.getAddUserMethod()

  val removeUserMethod: MethodDescriptor<UserOuterClass.RemoveUserRequest, Empty>
    @JvmStatic
    get() = UserServiceGrpc.getRemoveUserMethod()

  val addLorakeyMethod: MethodDescriptor<UserOuterClass.AddLorakeyRequest, Empty>
    @JvmStatic
    get() = UserServiceGrpc.getAddLorakeyMethod()

  val removeLorakeyMethod: MethodDescriptor<UserOuterClass.RemoveLorakeyRequest, Empty>
    @JvmStatic
    get() = UserServiceGrpc.getRemoveLorakeyMethod()

  val getLorakeyMethod: MethodDescriptor<UserOuterClass.GetLorakeyRequest,
      UserOuterClass.GetLorakeyResponse>
    @JvmStatic
    get() = UserServiceGrpc.getGetLorakeyMethod()

  val loginUserMethod: MethodDescriptor<UserOuterClass.LoginUserRequest,
      UserOuterClass.LoginUserResponse>
    @JvmStatic
    get() = UserServiceGrpc.getLoginUserMethod()

  val logoutUserMethod: MethodDescriptor<UserOuterClass.LogoutUserRequest, Empty>
    @JvmStatic
    get() = UserServiceGrpc.getLogoutUserMethod()

  /**
   * A stub for issuing RPCs to a(n) proto.UserService service as suspending coroutines.
   */
  @StubFor(UserServiceGrpc::class)
  class UserServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<UserServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): UserServiceCoroutineStub =
        UserServiceCoroutineStub(channel, callOptions)

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
    suspend fun getUser(request: UserOuterClass.GetUserRequest): UserOuterClass.GetUserResponse =
        unaryRpc(
      channel,
      UserServiceGrpc.getGetUserMethod(),
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
    suspend fun addUser(request: UserOuterClass.AddUserRequest): Empty = unaryRpc(
      channel,
      UserServiceGrpc.getAddUserMethod(),
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
    suspend fun removeUser(request: UserOuterClass.RemoveUserRequest): Empty = unaryRpc(
      channel,
      UserServiceGrpc.getRemoveUserMethod(),
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
    suspend fun addLorakey(request: UserOuterClass.AddLorakeyRequest): Empty = unaryRpc(
      channel,
      UserServiceGrpc.getAddLorakeyMethod(),
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
    suspend fun removeLorakey(request: UserOuterClass.RemoveLorakeyRequest): Empty = unaryRpc(
      channel,
      UserServiceGrpc.getRemoveLorakeyMethod(),
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
    suspend fun getLorakey(request: UserOuterClass.GetLorakeyRequest):
        UserOuterClass.GetLorakeyResponse = unaryRpc(
      channel,
      UserServiceGrpc.getGetLorakeyMethod(),
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
    suspend fun loginUser(request: UserOuterClass.LoginUserRequest):
        UserOuterClass.LoginUserResponse = unaryRpc(
      channel,
      UserServiceGrpc.getLoginUserMethod(),
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
    suspend fun logoutUser(request: UserOuterClass.LogoutUserRequest): Empty = unaryRpc(
      channel,
      UserServiceGrpc.getLogoutUserMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the proto.UserService service based on Kotlin coroutines.
   */
  abstract class UserServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for proto.UserService.GetUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getUser(request: UserOuterClass.GetUserRequest): UserOuterClass.GetUserResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.UserService.GetUser is unimplemented"))

    /**
     * Returns the response to an RPC for proto.UserService.AddUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun addUser(request: UserOuterClass.AddUserRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.UserService.AddUser is unimplemented"))

    /**
     * Returns the response to an RPC for proto.UserService.RemoveUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun removeUser(request: UserOuterClass.RemoveUserRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.UserService.RemoveUser is unimplemented"))

    /**
     * Returns the response to an RPC for proto.UserService.AddLorakey.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun addLorakey(request: UserOuterClass.AddLorakeyRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.UserService.AddLorakey is unimplemented"))

    /**
     * Returns the response to an RPC for proto.UserService.RemoveLorakey.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun removeLorakey(request: UserOuterClass.RemoveLorakeyRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.UserService.RemoveLorakey is unimplemented"))

    /**
     * Returns the response to an RPC for proto.UserService.GetLorakey.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getLorakey(request: UserOuterClass.GetLorakeyRequest):
        UserOuterClass.GetLorakeyResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.UserService.GetLorakey is unimplemented"))

    /**
     * Returns the response to an RPC for proto.UserService.LoginUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun loginUser(request: UserOuterClass.LoginUserRequest):
        UserOuterClass.LoginUserResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.UserService.LoginUser is unimplemented"))

    /**
     * Returns the response to an RPC for proto.UserService.LogoutUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun logoutUser(request: UserOuterClass.LogoutUserRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.UserService.LogoutUser is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserServiceGrpc.getGetUserMethod(),
      implementation = ::getUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserServiceGrpc.getAddUserMethod(),
      implementation = ::addUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserServiceGrpc.getRemoveUserMethod(),
      implementation = ::removeUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserServiceGrpc.getAddLorakeyMethod(),
      implementation = ::addLorakey
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserServiceGrpc.getRemoveLorakeyMethod(),
      implementation = ::removeLorakey
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserServiceGrpc.getGetLorakeyMethod(),
      implementation = ::getLorakey
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserServiceGrpc.getLoginUserMethod(),
      implementation = ::loginUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserServiceGrpc.getLogoutUserMethod(),
      implementation = ::logoutUser
    )).build()
  }
}
