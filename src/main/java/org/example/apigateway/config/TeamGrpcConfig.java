package org.example.apigateway.config;

import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.client.inject.GrpcClientBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.example.apigateway.service.TeamService;
import org.example.apigateway.grpc.team.TeamGrpc;

@Configuration
@GrpcClientBean(
        clazz = org.example.apigateway.grpc.team.TeamGrpc.TeamBlockingStub.class,
        beanName = "team_blockingStub",
        client = @GrpcClient("team_service")
)
public class TeamGrpcConfig {
    @Bean
        TeamService teamService(@GrpcClient("team_service") TeamGrpc.TeamBlockingStub blockingStub) {
        return new TeamService(blockingStub);
    }
}
