package de.fiwareManager

import io.grpc.stub.StreamObserver

private class JwtManagerService: JWTManagerServiceGrpc.JWTManagerServiceImplBase() {
    override fun generateJWT(request: GenerateJWTRequest?, responseObserver: StreamObserver<GenerateJWTResponse>?) {
        super.generateJWT(request, responseObserver)

    }

}