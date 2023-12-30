package org.example.apigateway.controllers;


import org.example.apigateway.codegen.types.Agency;
import org.example.apigateway.grpc.agency.AgencyOuterClass;
import org.example.apigateway.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AgencyController {

    AgencyService agencyService;

    @Autowired
    public AgencyController(AgencyService agencyService) {
        this.agencyService = agencyService;
    }

    @MutationMapping("createAgency")
    Agency createAgency(@Argument String name) {
        AgencyOuterClass.CreateAgencyResponse response = agencyService.createAgency(name);
        return Agency.newBuilder().name(response.getName()).build();
    }

    @QueryMapping("getAgency")
    Agency getAgency(@Argument String name) {
        AgencyOuterClass.GetAgencyResponse response = agencyService.getAgency(name);
        return Agency.newBuilder().name(response.getName()).build();
    }

    @QueryMapping("getAgencies")
    Iterable<Agency> getAgencies() {
        AgencyOuterClass.GetAgenciesResponse response = agencyService.getAgencies();
        return response.getAgenciesList().stream().map(agency -> Agency.newBuilder().name(agency.getName()).build()).toList();
    }

    @MutationMapping("updateAgency")
    Agency updateAgency(@Argument String id, @Argument String name) {
        AgencyOuterClass.UpdateAgencyResponse response = agencyService.updateAgency(id, name);
        return Agency.newBuilder().name(response.getName()).build();
    }

    @MutationMapping("deleteAgency")
    Agency deleteAgency(@Argument String id) {
        AgencyOuterClass.DeleteAgencyResponse response = agencyService.deleteAgency(id);
        return Agency.newBuilder().name(response.getName()).build();
    }
}
