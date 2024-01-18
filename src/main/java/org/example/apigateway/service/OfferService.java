package org.example.apigateway.service;

import lombok.AllArgsConstructor;
import org.example.apigateway.codegen.types.AgencyInput;
import org.example.apigateway.codegen.types.OfferType;
import org.example.apigateway.grpc.offer.OfferGrpc;
import org.springframework.stereotype.Service;
import org.example.apigateway.grpc.offer.OfferOuterClass;


@Service
@AllArgsConstructor
public class OfferService {

    private OfferGrpc.OfferBlockingStub offerStub;

    public OfferOuterClass.GetOffersResponse getOffers() {
        return offerStub.getOffers(OfferOuterClass.GetOffersRequest.newBuilder()
                .build());
    }

    public OfferOuterClass.GetOfferResponse getOffer(String name) {
        return offerStub.getOffer(OfferOuterClass.GetOfferRequest.newBuilder()
                .setName(name)
                .build());
    }

    public OfferOuterClass.CreateOfferResponse createOffer(String name, String agencyId, String description, int price, String date, OfferOuterClass.OfferType type) {
        return offerStub.createOffer(OfferOuterClass.CreateOfferRequest.newBuilder()
                .setName(name)
                .setAgencyId(agencyId)
                .setDescription(description)
                .setPrice(price)
                .setDate(date)
                .setType(type)
                .build());
    }

    public OfferOuterClass.UpdateOfferResponse updateOffer(String id, String name, AgencyInput agency, String description, int price, String date, int rating, OfferType type) {
        return offerStub.updateOffer(OfferOuterClass.UpdateOfferRequest.newBuilder()
                .setId(id)
                .setName(name)
                .setAgency(OfferOuterClass.AgencyItem.newBuilder()
                        .setName(agency.getName())
                        .setDescription(agency.getDescription())
                        .setPlan(agency.getPlan())
                        .build())
                .setDescription(description)
                .setPrice(price)
                .setDate(date)
                .setRating(rating)
                .setType(OfferOuterClass.OfferType.valueOf(type.name()))
                .build());
    }

    public OfferOuterClass.DeleteOfferResponse deleteOffer(String id) {
        return offerStub.deleteOffer(OfferOuterClass.DeleteOfferRequest.newBuilder()
                .setId(id)
                .build());
    }
}
