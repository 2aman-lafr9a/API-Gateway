package org.example.apigateway.service;


import grpc.java.org.example.apigateway.grpc.AuthenticationGrpc;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.example.apigateway.grpc.AuthenticationOuterClass;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class AuthService {




    private AuthenticationGrpc.AuthenticationBlockingStub authenticationStub;

    public void signIn(String userName, String password) {
        AuthenticationOuterClass.SignInResponse signInResponse = authenticationStub.signIn(AuthenticationOuterClass.SignInRequest.newBuilder()
                .setUsername(userName)
                .setPassword(password)
                .build());

        System.out.println("Token: " + signInResponse.getJwt());
    }

    public void signUp(String userName, String password,String role) {
        AuthenticationOuterClass.SignUpResponse signUpResponse = authenticationStub.signUp(AuthenticationOuterClass.SignUpRequest.newBuilder()
                .setUsername(userName)
                .setPassword(password)
                .setRole(role)
                .build());

        System.out.println("Message: " + signUpResponse.getMessage());
        System.out.println("Status: " + signUpResponse.getSuccess());
    }

    public AuthenticationOuterClass.TokenValidationResponse validateToken(String jwt) {
        return authenticationStub.validateToken(AuthenticationOuterClass.TokenValidationRequest.newBuilder()
                .setJwt(jwt)
                .build());
    }
}
