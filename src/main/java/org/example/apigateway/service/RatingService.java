package org.example.apigateway.service;

import lombok.AllArgsConstructor;
import org.example.apigateway.grpc.rating.RatingGrpc;
import org.example.apigateway.grpc.rating.RatingOuterClass;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RatingService {
    private RatingGrpc.RatingBlockingStub rating_blockingStub;

    public RatingOuterClass.GetRatingsResponse getRatings() {
        return rating_blockingStub.findAll(RatingOuterClass.GetRatingsRequest.newBuilder()
                .build());
    }

    public RatingOuterClass.GetRatingResponse getRating(String offerId, String playerId) {
        return rating_blockingStub.findById(RatingOuterClass.GetRatingRequest.newBuilder()
                .setOfferId(offerId)
                .setPlayerId(playerId)
                .build());
    }

    public RatingOuterClass.UpdateRatingResponse UpdateRating(String offerId, String playerId, int rating) {
        return rating_blockingStub.update(RatingOuterClass.UpdateRatingRequest.newBuilder()
                .setRating(RatingOuterClass.RatingItem.newBuilder()
                    .setOfferId(offerId)
                    .setPlayerId(playerId)
                    .setRating(rating)
                    .build())
                .build());
    }
}
