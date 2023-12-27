package org.example.apigateway.config;

import grpc.java.org.example.apigateway.grpc.AuthenticationGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.client.inject.GrpcClientBean;
import org.example.apigateway.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@GrpcClientBean(
        clazz = AuthenticationGrpc.AuthenticationBlockingStub.class,
        beanName = "blockingStub",
        client = @GrpcClient("authentication")
)
public class GrpcConfig {

    @Bean
    AuthService authService(@Autowired AuthenticationGrpc.AuthenticationBlockingStub blockingStub) {
        return new AuthService(blockingStub);
    }

}