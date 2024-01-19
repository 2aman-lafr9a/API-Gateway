package org.example.apigateway.config.grpc;

import net.devh.boot.grpc.client.inject.GrpcClientBean;
import org.example.apigateway.grpc.rating.RatingGrpc;
import org.example.apigateway.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@GrpcClientBean(
        clazz = org.example.apigateway.grpc.rating.RatingGrpc.RatingBlockingStub.class,
        beanName = "rating_blockingStub",
        client = @net.devh.boot.grpc.client.inject.GrpcClient("rating_service")
)
public class RatingGrpcConfig {
    @Bean
    RatingService ratingService(@Autowired RatingGrpc.RatingBlockingStub blockingStub) {
        return new RatingService(blockingStub);
    }
}
