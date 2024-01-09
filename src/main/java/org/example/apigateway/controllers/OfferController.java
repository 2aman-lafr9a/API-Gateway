package org.example.apigateway.controllers;

import org.example.apigateway.codegen.types.Offer;
import org.example.apigateway.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.example.apigateway.grpc.offer.OfferOuterClass;

@Controller
public class OfferController {
    OfferService offerService;

    @Autowired
    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @QueryMapping("getOffers")
    public Iterable<Offer> getOffers() {
        OfferOuterClass.GetOffersResponse response = offerService.getOffers();
        return response.getOffersList().stream().map(offer -> Offer.newBuilder()
                .id(offer.getId())
                .name(offer.getName())
                .description(offer.getDescription())
                .date(offer.getDate())
                .build()).toList();
    }

    @QueryMapping("getOffer")
    public Offer getOffer(@Argument String name) {
        OfferOuterClass.GetOfferResponse response = offerService.getOffer(name);
        return Offer.newBuilder()
                .id(response.getId())
                .name(response.getName())
                .description(response.getDescription())
                .date(response.getDate())
                .build();
    }

    @MutationMapping("createOffer")
    public Offer createOffer(@Argument String name, @Argument String agency, @Argument String description, @Argument int price, @Argument String date) {
        OfferOuterClass.CreateOfferResponse response = offerService.createOffer(name, agency, description, price, date);
        return Offer.newBuilder()
                .id(response.getId())
                .name(response.getName())
                .description(response.getDescription())
                .date(response.getDate())
                .build();
    }

    @MutationMapping("updateOffer")
    public Offer updateOffer(@Argument String id, @Argument String name, @Argument String agency, @Argument String description, @Argument int price, @Argument String date) {
        OfferOuterClass.UpdateOfferResponse response = offerService.updateOffer(id, name, agency, description, price, date);
        return Offer.newBuilder()
                .id(response.getId())
                .name(response.getName())
                .description(response.getDescription())
                .date(response.getDate())
                .build();
    }

    @MutationMapping("deleteOffer")
    public Offer deleteOffer(@Argument String id) {
        OfferOuterClass.DeleteOfferResponse response = offerService.deleteOffer(id);
        return Offer.newBuilder()
                .id(response.getId())
                .name(response.getName())
                .description(response.getDescription())
                .date(response.getDate())
                .build();
    }
}
