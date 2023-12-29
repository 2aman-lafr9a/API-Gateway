//package org.example.apigateway.controllers;
//
//import org.example.apigateway.codegen.types.Agency;
//import org.example.apigateway.service.OldAgencyService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.graphql.data.method.annotation.MutationMapping;
//import org.springframework.graphql.data.method.annotation.QueryMapping;
//import org.springframework.stereotype.Controller;
//
//@Controller
//public class AgencyControllerOld {
//
//    @Autowired
//    private final OldAgencyService agencyService;
//
//    public AgencyControllerOld(OldAgencyService agencyService) {
//        this.agencyService = agencyService;
//    }
//
//    @QueryMapping
//    Iterable<Agency> getAgencies() {
//        return agencyService.getAgencies();
//    }
//
//    @QueryMapping
//    Agency getAgency(String name) {
//        return agencyService.getAgency(name);
//    }
//
//    @MutationMapping
//    Agency createAgency(String name) {
//        return agencyService.createAgency(name);
//    }
//
//    @MutationMapping
//    Agency updateAgency(String id, String name) {
//        return agencyService.updateAgency(id, name);
//    }
//
//    @MutationMapping
//    Agency deleteAgency(String id) {
//        return agencyService.deleteAgency(id);
//    }
//}
