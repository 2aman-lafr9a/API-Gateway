package org.example.apigateway.service;


import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import protobuf.grpc.authentication.AuthenticationGrpc;

@Service
public class AuthService {

    @GrpcClient("authentication-service")
    private AuthenticationGrpc.AuthenticationBlockingStub authenticationStub;

    public void signIn(String userName, String password) {
        authentication.SignInResponse signInResponse = authenticationStub.signIn(authentication.SignInRequest.newBuilder()
                .setUsername(userName)
                .setPassword(password)
                .build());

        System.out.println("Token: " + signInResponse.getJwt());
    }

    public void signUp(String userName, String password) {
        authentication.SignUpResponse signUpResponse = authenticationStub.signUp(authentication.SignUpRequest.newBuilder()
                .setUsername(userName)
                .setPassword(password)
                .build());

        System.out.println("Message: " + signUpResponse.getMessage());
        System.out.println("Status: " + signUpResponse.getSuccess());
    }
}
