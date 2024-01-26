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
import java.util.Arrays;
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


    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> signIn(@Valid @RequestBody UserSignIn userSignIn, HttpServletResponse response) {

        // response body
        Map<String, String> responseBody = new HashMap<>();

        try {
            AuthenticationOuterClass.SignInResponse signInResponse = authService.signIn(userSignIn.getUserName(), userSignIn.getPassword());
            responseBody.put("message", signInResponse.getMessage());
            responseBody.put("success", String.valueOf(signInResponse.getSuccess()));
            responseBody.put("jwt", signInResponse.getJwt());
            Cookie cookie = new Cookie("jwt", signInResponse.getJwt());
            cookie.setMaxAge(3600);
            cookie.setSecure(false);
            cookie.setHttpOnly(false);
            response.addCookie(cookie);

            return new ResponseEntity<>(responseBody, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
            responseBody.put("message", e.getMessage());
            responseBody.put("success", "false");
            return new ResponseEntity<>(responseBody, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/signup")
    public ResponseEntity<Map<String, String>> signUp(@Valid @RequestBody UserSignUp userSignUp) {

        // response body
        Map<String, String> responseBody = new HashMap<>();
        try {
            AuthenticationOuterClass.SignUpResponse signUpResponse = authService.signUp(userSignUp.getUserName(), userSignUp.getPassword(), userSignUp.getRole());
            responseBody.put("message", signUpResponse.getMessage());
            responseBody.put("success", String.valueOf(signUpResponse.getSuccess()));
            return new ResponseEntity<>(responseBody, HttpStatus.OK);
        } catch (Exception e) {
            responseBody.put("message", e.getMessage());
            responseBody.put("success", "false");
            return new ResponseEntity<>(responseBody, HttpStatus.BAD_REQUEST);
        }

    }
}
