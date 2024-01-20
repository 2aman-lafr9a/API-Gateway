package org.example.apigateway;

import org.example.apigateway.utils.ResolveHostnameToIP;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Properties;

@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ApiGatewayApplication.class);

        //set the configuration for  the grpc clients(may change in the future)
        Properties properties = new Properties();

        //?authentication_service is the name of the service in the docker-compose.yml file
        properties.setProperty("grpc.client.authentication_service.address", "static://" + ResolveHostnameToIP.resolve("authentication_service") + ":50000");

        properties.setProperty("grpc.client.authentication_service.negotiation-type", "plaintext");

        //?agency_service is the name of the service in the docker-compose.yml file
        properties.setProperty("grpc.client.agency_service.address", "static://" + ResolveHostnameToIP.resolve("agency_service") + ":50001");
        properties.setProperty("grpc.client.agency_service.negotiation-type", "plaintext");

        //?offer_service is the name of the service in the docker-compose.yml file
        properties.setProperty("grpc.client.offer_service.address", "static://" + ResolveHostnameToIP.resolve("offer_service") + ":50002");
        properties.setProperty("grpc.client.offer_service.negotiation-type", "plaintext");

        //?team_service is the name of the service in the docker-compose.yml file
        properties.setProperty("grpc.client.team_service.address", "static://" + ResolveHostnameToIP.resolve("team_service") + ":50003");
        properties.setProperty("grpc.client.team_service.negotiation-type", "plaintext");

        //?user_service is the name of the service in the docker-compose.yml file
        properties.setProperty("grpc.client.user_service.address", "static://" + ResolveHostnameToIP.resolve("user_service") + ":50004");
        properties.setProperty("grpc.client.user_service.negotiation-type", "plaintext");

        //?player_service is the name of the service in the docker-compose.yml file
        properties.setProperty("grpc.client.player_service.address", "static://" + ResolveHostnameToIP.resolve("player_service") + ":50005");
        properties.setProperty("grpc.client.player_service.negotiation-type", "plaintext");

        //?rating_service is the name of the service in the docker-compose.yml file
        properties.setProperty("grpc.client.rating_service.address", "static://" + ResolveHostnameToIP.resolve("rating_service") + ":50006");
        properties.setProperty("grpc.client.rating_service.negotiation-type", "plaintext");

        //?teamManager_service is the name of the service in the docker-compose.yml file
        properties.setProperty("grpc.client.teamManager_service.address", "static://" + ResolveHostnameToIP.resolve("teamManager_service") + ":50007");
        properties.setProperty("grpc.client.teamManager_service.negotiation-type", "plaintext");

        application.setDefaultProperties(properties);
        application.run(args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(@NotNull CorsRegistry registry) {
//                todo change allowed origins
                registry.addMapping("/**").allowedOrigins("http://localhost:3000", "http://localhost:5173");
            }
        };
    }


}