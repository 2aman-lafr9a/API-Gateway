package org.example.apigateway.service;


import org.example.apigateway.grpc.authentication.AuthenticationGrpc;
import lombok.AllArgsConstructor;
import org.example.apigateway.grpc.authentication.AuthenticationOuterClass;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class AuthService {


    private AuthenticationGrpc.AuthenticationBlockingStub authenticationStub;

    public AuthenticationOuterClass.SignInResponse signIn(String userName, String password) {
        return authenticationStub.signIn(AuthenticationOuterClass.SignInRequest.newBuilder()
                .setUsername(userName)
                .setPassword(password)
                .build());

    }

    public AuthenticationOuterClass.SignUpResponse signUp(String userName, String password, String role) {
        return authenticationStub.signUp(AuthenticationOuterClass.SignUpRequest.newBuilder()
                .setUsername(userName)
                .setPassword(password)
                .setRole(role)
                .build());
    }

    public AuthenticationOuterClass.TokenValidationResponse validateToken(String jwt) {
        return authenticationStub.validateToken(AuthenticationOuterClass.TokenValidationRequest.newBuilder()
                .setJwt(jwt)
                .build());
    }
}
