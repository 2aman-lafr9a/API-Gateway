package org.example.apigateway.controllers;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.example.apigateway.dto.UserSignIn;
import org.example.apigateway.dto.UserSignUp;
import org.example.apigateway.grpc.authentication.AuthenticationOuterClass;
import org.example.apigateway.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    AuthService authService;


    @Autowired
    AuthController(AuthService authService) {
        this.authService = authService;
    }


    @PostMapping("/signIn")
    public ResponseEntity<Map<String, String>> signIn(@Valid @RequestBody UserSignIn userSignIn, HttpServletResponse response) {
        AuthenticationOuterClass.SignInResponse signInResponse = authService.signIn(userSignIn.getUserName(), userSignIn.getPassword());


        Map<String, String> responseBody = new HashMap<>();
        responseBody.put("message", signInResponse.getMessage());
        responseBody.put("success", String.valueOf(signInResponse.getSuccess()));

        if (!signInResponse.getSuccess()) {
            return new ResponseEntity<>(responseBody, HttpStatus.UNAUTHORIZED);
        }
        Cookie cookie = new Cookie("jwt", signInResponse.getJwt());
        cookie.setMaxAge(3600);
        cookie.setSecure(false);
        cookie.setHttpOnly(false);
        response.addCookie(cookie);
        responseBody.put("jwt", signInResponse.getJwt());

        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

    @PostMapping("/signUp")
    public ResponseEntity<String> signUp(@Valid @RequestBody UserSignUp userSignUp) {
        AuthenticationOuterClass.SignUpResponse signUpResponse = authService.signUp(userSignUp.getUserName(), userSignUp.getPassword(), userSignUp.getRole());
        if (!signUpResponse.getSuccess()) {
            return new ResponseEntity<>(signUpResponse.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(signUpResponse.getMessage(), HttpStatus.OK);
    }
}
