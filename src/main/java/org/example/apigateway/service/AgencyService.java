package org.example.apigateway.service;

import org.example.apigateway.codegen.types.Agency;
import org.example.apigateway.grpc.AgencyOuterClass;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class AgencyService {

    @QueryMapping
    public Agency getAgency(@Argument String name) {
        AgencyOuterClass.GetAgencyResponse agencyResponse = AgencyOuterClass.GetAgencyResponse.newBuilder().setName(name).build();
        return Agency.newBuilder().name(agencyResponse.getName()).build();
    }

    @QueryMapping
    public List<Agency> getAgencies() {
        AgencyOuterClass.GetAgenciesResponse agenciesResponse = AgencyOuterClass.GetAgenciesResponse.newBuilder().build();
        List<Agency> agencies = new ArrayList<>();
        for (AgencyOuterClass.AgencyMessage agency : agenciesResponse.getAgenciesList()) {
            agencies.add(Agency.newBuilder().name(agency.getName()).build());
        }
        return agencies;
    }
}
