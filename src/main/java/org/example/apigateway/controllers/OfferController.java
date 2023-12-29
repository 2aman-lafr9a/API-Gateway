package org.example.apigateway.controllers;

import org.example.apigateway.codegen.types.Offer;
import org.example.apigateway.service.OfferService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class OfferController {
    private final OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @QueryMapping
    Iterable<Offer> getOffers() {
        return offerService.getOffers();
    }

    @QueryMapping
    Offer getOffer(String id) {
        return offerService.getOffer(id);
    }

    @QueryMapping
    Offer createOffer(String name, String agency, String description, String price, String date) {
        return offerService.createOffer(name, agency, description, price, date);
    }

    @QueryMapping
    Offer updateOffer(String id, String name, String agency, String description, String price, String date) {
        return offerService.updateOffer(id, name, agency, description, price, date);
    }

    @QueryMapping
    Offer deleteOffer(String id) {
        return offerService.deleteOffer(id);
    }
}
