package org.example.apigateway.config.grpc;

import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.client.inject.GrpcClientBean;
import org.example.apigateway.service.PlayerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.example.apigateway.grpc.player.PlayerGrpc;

@Configuration
@GrpcClientBean(
        clazz = PlayerGrpc.PlayerBlockingStub.class,
        beanName = "playerBlockingStub",
        client = @GrpcClient("player_service")
)
public class PlayerGrpcConfig {
    @Bean
    PlayerService playerService(@GrpcClient("player_service") PlayerGrpc.PlayerBlockingStub playerBlockingStub) {
        return new PlayerService(playerBlockingStub);
    }
}
