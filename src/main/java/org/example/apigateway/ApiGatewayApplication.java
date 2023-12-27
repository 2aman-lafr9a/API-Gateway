package org.example.apigateway;

import org.example.apigateway.service.AuthService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ApiGatewayApplication.class, args);
        AuthService authServiceClient = applicationContext.getBean(AuthService.class);
        authServiceClient.signIn("user", "password");
    }
}
