package org.example.apigateway;

import graphql.schema.idl.TypeRuntimeWiring;
import org.example.apigateway.service.AgencyService;
//import org.example.apigateway.service.AuthService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

import java.util.function.UnaryOperator;

@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ApiGatewayApplication.class, args);
        AgencyService agencyServiceClient = applicationContext.getBean(AgencyService.class);
        //AuthService authServiceClient = applicationContext.getBean(AuthService.class);
        //authServiceClient.login("admin", "admin");
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
                                    return agencyService.getAgency(name);
                                })
                                .dataFetcher("agencies", environment -> {
                                    return agencyService.getAgencies();
                                });
                    }
                });
    }
}