package org.example.apigateway.controllers;

import org.example.apigateway.grpc.authentication.AuthenticationOuterClass;
import org.example.apigateway.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController("/api/v1/auth")
public class AuthController {
    AuthService authService;


    @Autowired
    AuthController(AuthService authService) {
        this.authService = authService;
    }


    @PostMapping("/signIn")
    public void signIn(@RequestBody AuthenticationOuterClass.SignInRequest signInRequest) {
        authService.signIn(signInRequest.getUsername(), signInRequest.getPassword());
    }

    @PostMapping("/signUp")
    public void signIn(@RequestBody AuthenticationOuterClass.SignUpRequest signUpRequest) {
        authService.signUp(signUpRequest.getUsername(), signUpRequest.getPassword(), signUpRequest.getRole());
    }
}
