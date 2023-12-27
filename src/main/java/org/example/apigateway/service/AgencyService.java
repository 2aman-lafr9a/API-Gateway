package org.example.apigateway.service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.example.apigateway.codegen.types.Agency;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Service;
import org.example.apigateway.outerClass.AgencyOuterClass;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgencyService {
    String HOST = "localhost";
    int PORT = 50001;
    ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT)
            .usePlaintext()
            .build();
    @QueryMapping
    public Agency getAgency(@Argument String name) {
        AgencyOuterClass.Agency agencyResponse = AgencyOuterClass.Agency.newBuilder()
                .setName(name)
                .build();
        return Agency.newBuilder()
                .name(agencyResponse.getName())
                .build();
    }

    @QueryMapping
    public List<Agency> getAgencies() {
        AgencyOuterClass.GetAgenciesResponse agenciesResponse = AgencyOuterClass.GetAgenciesResponse.newBuilder()
                .build();
        List<Agency> agencies = new ArrayList<>();
        for (AgencyOuterClass.Agency agency : agenciesResponse.getAgenciesList()) {
            agencies.add(Agency.newBuilder()
                    .name(agency.getName())
                    .build());
        }
        return agencies;
    }
}
