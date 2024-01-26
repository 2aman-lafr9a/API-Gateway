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
    public Agency createAgency(@Argument String name, @Argument String description, @Argument String plan) {
        AgencyOuterClass.CreateAgencyResponse response = agencyService.createAgency(name, description, plan);
        return Agency.newBuilder().name(response.getName()).description(response.getDescription()).plan(response.getPlan()).build();
    }

    @QueryMapping("getAgencyByWallet")
    public Agency getAgencyByWallet(@Argument String wallet) {
        AgencyOuterClass.GetAgencyByWalletResponse response = agencyService.getAgencyByWallet(wallet);
        return Agency.newBuilder().name(response.getName()).description(response.getDescription()).plan(response.getPlan()).Offers(response.getOffersList().stream().map(offer -> org.example.apigateway.codegen.types.Offer.newBuilder().id(offer.getId()).name(offer.getName()).description(offer.getDescription()).build()).toList()).build();
    }

    @QueryMapping("getAgency")
    public Agency getAgency(@Argument String name) {
        AgencyOuterClass.GetAgencyResponse response = agencyService.getAgency(name);
        return Agency.newBuilder().name(response.getName()).description(response.getDescription()).plan(response.getPlan()).Offers(response.getOffersList().stream().map(offer -> org.example.apigateway.codegen.types.Offer.newBuilder().id(offer.getId()).name(offer.getName()).description(offer.getDescription()).build()).toList()).build();
    }

    @QueryMapping("getAgencies")
    public Iterable<Agency> getAgencies() {
        AgencyOuterClass.GetAgenciesResponse response = agencyService.getAgencies();
        return response.getAgenciesList().stream().map(agency -> Agency.newBuilder().name(agency.getName()).description(agency.getDescription()).plan(agency.getPlan()).Offers(agency.getOffersList().stream().map(offer -> org.example.apigateway.codegen.types.Offer.newBuilder().id(offer.getId()).name(offer.getName()).description(offer.getDescription()).build()).toList()).build()).toList();
    }

    @MutationMapping("updateAgency")
    public Agency updateAgency(@Argument String id, @Argument String name, @Argument String description, @Argument String plan) {
        AgencyOuterClass.UpdateAgencyResponse response = agencyService.updateAgency(id, name, description, plan);
        return Agency.newBuilder().name(response.getName()).description(response.getDescription()).plan(response.getPlan()).Offers(response.getOffersList().stream().map(offer -> org.example.apigateway.codegen.types.Offer.newBuilder().id(offer.getId()).name(offer.getName()).description(offer.getDescription()).build()).toList()).build();
    }

    @MutationMapping("deleteAgency")
    public Agency deleteAgency(@Argument String id) {
        AgencyOuterClass.DeleteAgencyResponse response = agencyService.deleteAgency(id);
        return Agency.newBuilder().name(response.getName()).description(response.getDescription()).plan(response.getPlan()).Offers(response.getOffersList().stream().map(offer -> org.example.apigateway.codegen.types.Offer.newBuilder().id(offer.getId()).name(offer.getName()).description(offer.getDescription()).build()).toList()).build();
    }


}
