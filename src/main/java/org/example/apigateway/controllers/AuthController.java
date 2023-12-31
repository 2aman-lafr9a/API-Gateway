package org.example.apigateway.controllers;

import org.example.apigateway.dto.UserSignIn;
import org.example.apigateway.dto.UserSignUp;
import org.example.apigateway.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    AuthService authService;


    @Autowired
    AuthController(AuthService authService) {
        this.authService = authService;
    }


    @PostMapping("/signIn")
    public void signIn(@RequestBody UserSignIn userSignIn) {
        authService.signIn(userSignIn.getUserName(), userSignIn.getPassword());
    }

    @PostMapping("/signOut")
    public void signOut() {
        System.out.println("signOut");
    }

    @PostMapping("/signUp")
    public void signIn(@RequestBody UserSignUp userSignUp) {
        authService.signUp(userSignUp.getUserName(), userSignUp.getPassword(), userSignUp.getRole());
    }
}
