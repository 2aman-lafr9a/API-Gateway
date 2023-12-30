package org.example.apigateway.config;

import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.client.inject.GrpcClientBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.example.apigateway.service.OfferService;
import org.example.apigateway.grpc.offer.OfferGrpc;

@Configuration
@GrpcClientBean(
        clazz = org.example.apigateway.grpc.offer.OfferGrpc.OfferBlockingStub.class,
        beanName = "offerBlockingStub",
        client = @GrpcClient("offer_service")
)
public class OfferGrpcConfig {
    @Bean
    OfferService offerService(@Autowired OfferGrpc.OfferBlockingStub offerBlockingStub) {
        return new OfferService(offerBlockingStub);
    }
}
