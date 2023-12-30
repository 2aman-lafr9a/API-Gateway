package org.example.apigateway.config;


import org.example.apigateway.grpc.AgencyGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.client.inject.GrpcClientBean;
import org.example.apigateway.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@GrpcClientBean(
        clazz = AgencyGrpc.AgencyBlockingStub.class,
        beanName = "blockingStub",
        client = @GrpcClient("agency_service")
)
public class AgencyGrpcConfig {
    @Bean
    AgencyService agencyService(@Autowired AgencyGrpc.AgencyBlockingStub blockingStub) {
        return new AgencyService(blockingStub);
    }
}
