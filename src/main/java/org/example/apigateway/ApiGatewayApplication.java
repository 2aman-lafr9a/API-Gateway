package org.example.apigateway;

import graphql.schema.idl.TypeRuntimeWiring;
import org.example.apigateway.service.AgencyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

import java.util.function.UnaryOperator;

@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

    @Bean
    RuntimeWiringConfigurer runtimeWiringConfigurer(AgencyService agencyService) {
        return runtimeWiringBuilder -> runtimeWiringBuilder
                .type("Query", new UnaryOperator<TypeRuntimeWiring.Builder>() {
                    @Override
                    public TypeRuntimeWiring.Builder apply(TypeRuntimeWiring.Builder builder) {
                        return builder
                                .dataFetcher("agencyById", environment -> {
                                    String name = environment.getArgument("name");
                                    return agencyService;
                                })
                                .dataFetcher("agencies", environment -> {
                                    return agencyService.getAgencies();
                                });
                    }
                });
    }
}