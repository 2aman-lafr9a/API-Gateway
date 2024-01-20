package org.example.apigateway.config.grpc;

import net.devh.boot.grpc.client.inject.GrpcClientBean;
import org.example.apigateway.grpc.teamManager.TeamManagerGrpc;
import org.example.apigateway.service.TeamManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@GrpcClientBean(
        clazz = TeamManagerGrpc.TeamManagerBlockingStub.class,
        beanName = "teamManager_blockingStub",
        client = @net.devh.boot.grpc.client.inject.GrpcClient("teamManager_service")
)
public class TeamManagerGrpcConfig {

    @Bean
    TeamManagerService teamManagerService(@Autowired TeamManagerGrpc.TeamManagerBlockingStub blockingStub) {
        return new TeamManagerService(blockingStub);
    }
}
