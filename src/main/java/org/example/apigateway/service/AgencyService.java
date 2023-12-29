package org.example.apigateway.service;

import org.example.apigateway.codegen.types.Agency;
import org.example.apigateway.grpc.AgencyOuterClass;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
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

    @MutationMapping
    public Agency createAgency(@Argument String name) {
        AgencyOuterClass.CreateAgencyResponse createAgencyResponse = AgencyOuterClass.CreateAgencyResponse.newBuilder().setName(name).build();
        return Agency.newBuilder().name(createAgencyResponse.getName()).build();
    }

    @MutationMapping
    public Agency updateAgency(@Argument String id, @Argument String name) {
        AgencyOuterClass.UpdateAgencyResponse updateAgencyResponse = AgencyOuterClass.UpdateAgencyResponse.newBuilder().setId(id).setName(name).build();
        return Agency.newBuilder().name(updateAgencyResponse.getName()).build();
    }

    @MutationMapping
    public Agency deleteAgency(@Argument String id) {
        AgencyOuterClass.DeleteAgencyResponse deleteAgencyResponse = AgencyOuterClass.DeleteAgencyResponse.newBuilder().setId(id).build();
        return Agency.newBuilder().name(deleteAgencyResponse.getName()).build();
    }
}
