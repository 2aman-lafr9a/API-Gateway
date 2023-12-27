package org.example.apigateway.service;


import net.devh.boot.grpc.client.inject.GrpcClient;
import org.example.authentication.AuthenticationProto;
import org.springframework.stereotype.Service;
import org.example.authentication.AuthenticationGrpc;

@Service
public class AuthService {

    @GrpcClient("authentication-service")
    private AuthenticationGrpc.AuthenticationBlockingStub authenticationStub;

    public void signIn(String userName, String password) {
        AuthenticationProto.SignInResponse signInResponse = authenticationStub.signIn(AuthenticationProto.SignInRequest.newBuilder()
                .setUsername(userName)
                .setPassword(password)
                .build());

        System.out.println("Token: " + signInResponse.getJwt());
    }

    public void signUp(String userName, String password) {
        AuthenticationProto.SignUpResponse signUpResponse = authenticationStub.signUp(AuthenticationProto.SignUpRequest.newBuilder()
                .setUsername(userName)
                .setPassword(password)
                .build());

        System.out.println("Message: " + signUpResponse.getMessage());
        System.out.println("Status: " + signUpResponse.getSuccess());
    }
}
