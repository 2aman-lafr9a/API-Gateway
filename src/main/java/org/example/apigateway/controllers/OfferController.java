package org.example.apigateway.controllers;

import org.example.apigateway.codegen.types.Agency;
import org.example.apigateway.codegen.types.AgencyInput;
import org.example.apigateway.codegen.types.Offer;
import org.example.apigateway.codegen.types.OfferType;
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
                .rating(offer.getRating())
                .price(offer.getPrice())
                .agency(Agency.newBuilder()
                        .name(offer.getAgency().getName())
                        .description(offer.getAgency().getDescription())
                        .plan(offer.getAgency().getPlan())
                        .build())
                .offerType(OfferType.valueOf(offer.getType().name()))
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
                .rating(response.getRating())
                .price(response.getPrice())
                .agency(Agency.newBuilder()
                        .name(response.getAgency().getName())
                        .description(response.getAgency().getDescription())
                        .plan(response.getAgency().getPlan())
                        .build())
                .offerType(OfferType.valueOf(response.getType().name()))
                .build();
    }

    @QueryMapping("getOfferById")
    public Offer getOfferById(@Argument String id) {
        OfferOuterClass.GetOfferIdResponse response = offerService.getOfferById(id);
        return Offer.newBuilder()
                .id(response.getId())
                .name(response.getName())
                .description(response.getDescription())
                .date(response.getDate())
                .rating(response.getRating())
                .price(response.getPrice())
                .agency(Agency.newBuilder()
                        .name(response.getAgency().getName())
                        .description(response.getAgency().getDescription())
                        .plan(response.getAgency().getPlan())
                        .build())
                .offerType(OfferType.valueOf(response.getType().name()))
                .build();
    }

    @MutationMapping("createOffer")
    public Offer createOffer(@Argument String name, @Argument String agencyId, @Argument String description, @Argument int price, @Argument String date, @Argument OfferType offerType) {
        OfferOuterClass.OfferType Type = OfferOuterClass.OfferType.valueOf(offerType.name());
        OfferOuterClass.CreateOfferResponse response = offerService.createOffer(name, agencyId, description, price, date, Type);
        return Offer.newBuilder()
                .id(response.getId())
                .name(response.getName())
                .description(response.getDescription())
                .date(response.getDate())
                .price(response.getPrice())
                .agency(Agency.newBuilder()
                        .name(response.getAgency().getName())
                        .description(response.getAgency().getDescription())
                        .plan(response.getAgency().getPlan())
                        .build())
                .offerType(OfferType.valueOf(response.getType().name()))
                .build();
    }

    @MutationMapping("updateOffer")
    public Offer updateOffer(@Argument String id, @Argument String name, @Argument AgencyInput agency, @Argument String description, @Argument int price, @Argument String date, @Argument int rating, @Argument OfferType offerType) {
        OfferOuterClass.UpdateOfferResponse response = offerService.updateOffer(id, name, agency, description, price, date, rating, offerType);
        return Offer.newBuilder()
                .id(response.getId())
                .name(response.getName())
                .description(response.getDescription())
                .date(response.getDate())
                .rating(response.getRating())
                .price(response.getPrice())
                .agency(Agency.newBuilder()
                        .name(response.getAgency().getName())
                        .description(response.getAgency().getDescription())
                        .plan(response.getAgency().getPlan())
                        .build())
                .offerType(OfferType.valueOf(response.getType().name()))
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
                .rating(response.getRating())
                .price(response.getPrice())
                .agency(Agency.newBuilder()
                        .name(response.getAgency().getName())
                        .description(response.getAgency().getDescription())
                        .plan(response.getAgency().getPlan())
                        .build())
                .offerType(OfferType.valueOf(response.getType().name()))
                .build();
    }
}
