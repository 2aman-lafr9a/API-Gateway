package org.example.apigateway.service;

import lombok.AllArgsConstructor;
import org.example.apigateway.grpc.OfferGrpc;
import org.springframework.stereotype.Service;
import org.example.apigateway.grpc.OfferOuterClass;


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

    public OfferOuterClass.CreateOfferResponse createOffer(String name, String agency, String description, int price, String date) {
        return offerStub.createOffer(OfferOuterClass.CreateOfferRequest.newBuilder()
                .setName(name)
                .setAgencyId(agency)
                .setDescription(description)
                .setPrice(price)
                .setDate(date)
                .build());
    }

    public OfferOuterClass.UpdateOfferResponse updateOffer(String id, String name, String agency, String description, int price, String date) {
        return offerStub.updateOffer(OfferOuterClass.UpdateOfferRequest.newBuilder()
                .setId(id)
                .setName(name)
                .setAgencyId(agency)
                .setDescription(description)
                .setPrice(price)
                .setDate(date)
                .build());
    }

    public OfferOuterClass.DeleteOfferResponse deleteOffer(String id) {
        return offerStub.deleteOffer(OfferOuterClass.DeleteOfferRequest.newBuilder()
                .setId(id)
                .build());
    }
}
