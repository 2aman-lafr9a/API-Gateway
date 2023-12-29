package org.example.apigateway.controllers;


import org.example.apigateway.codegen.types.Agency;
import org.example.apigateway.grpc.AgencyOuterClass;
import org.example.apigateway.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
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
}
