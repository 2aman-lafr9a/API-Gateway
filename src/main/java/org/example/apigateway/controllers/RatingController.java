package org.example.apigateway.controllers;

import org.example.apigateway.grpc.rating.RatingOuterClass;
import org.example.apigateway.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.example.apigateway.codegen.types.Rating;

@Controller
public class RatingController {
    RatingService ratingService;

    @Autowired
    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @MutationMapping("updateRating")
    public Rating updateRating(@Argument String playerId, @Argument String offerId, @Argument int rating) {
        RatingOuterClass.UpdateRatingResponse response = ratingService.UpdateRating(offerId, playerId, rating);
        return Rating.newBuilder().offerId(response.getRating().getOfferId()).playerId(response.getRating().getPlayerId()).rating(response.getRating().getRating()).build();
    }

    @QueryMapping("getRating")
    public Rating getRating(@Argument String offerId, @Argument String playerId) {
        RatingOuterClass.GetRatingResponse response = ratingService.getRating(offerId, playerId);
        return Rating.newBuilder().offerId(response.getRating().getOfferId()).playerId(response.getRating().getPlayerId()).rating(response.getRating().getRating()).build();
    }

    @QueryMapping("getRatings")
    public Iterable<Rating> getRatings() {
        RatingOuterClass.GetRatingsResponse response = ratingService.getRatings();
        return response.getRatingsList().stream().map(rating -> Rating.newBuilder().offerId(rating.getOfferId()).playerId(rating.getPlayerId()).rating(rating.getRating()).build()).toList();
    }
}
