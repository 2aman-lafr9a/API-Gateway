package org.example.apigateway.service;

import org.example.apigateway.codegen.types.Offer;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Service;
import org.example.apigateway.grpc.OfferOuterClass;

import java.util.ArrayList;
import java.util.List;


@Service
public class OfferService {

    @QueryMapping
    public Offer getOffer(@Argument String id) {
        OfferOuterClass.GetOfferResponse offerResponse = OfferOuterClass.GetOfferResponse.newBuilder().setId(id).build();
        return Offer.newBuilder().id(offerResponse.getId()).build();
    }

    @QueryMapping
    public List<Offer> getOffers() {
        OfferOuterClass.GetOffersResponse offersResponse = OfferOuterClass.GetOffersResponse.newBuilder().build();
        List<Offer> offers = new ArrayList<>();
        for (OfferOuterClass.Offer offer : offersResponse.getOffersList()) {
            offers.add(Offer.newBuilder().id(offer.getId()).build());
        }
        return offers;
    }

    @MutationMapping
    public Offer createOffer(@Argument String name, @Argument String agency, @Argument String description, @Argument String price, @Argument String date) {
        OfferOuterClass.CreateOfferResponse createOfferResponse = OfferOuterClass.CreateOfferResponse.newBuilder().setName(name).setAgencyId(agency).setDescription(description).setPrice(price).setDate(date).build();
        return Offer.newBuilder().id(createOfferResponse.getId()).build();
    }

    @MutationMapping
    public Offer updateOffer(@Argument String id, @Argument String name, @Argument String agency, @Argument String description, @Argument String price, @Argument String date) {
        OfferOuterClass.UpdateOfferResponse updateOfferResponse = OfferOuterClass.UpdateOfferResponse.newBuilder().setId(id).setName(name).setAgencyId(agency).setDescription(description).setPrice(price).setDate(date).build();
        return Offer.newBuilder().id(updateOfferResponse.getId()).build();
    }

    @MutationMapping
    public Offer deleteOffer(@Argument String id) {
        OfferOuterClass.DeleteOfferResponse deleteOfferResponse = OfferOuterClass.DeleteOfferResponse.newBuilder().setId(id).build();
        return Offer.newBuilder().id(deleteOfferResponse.getId()).build();
    }
}
