package org.example.apigateway.controllers;

import org.example.apigateway.codegen.types.*;
import org.example.apigateway.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PlayerController {

    PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @QueryMapping("getPlayers")
    Iterable<Player> getPlayers(@Argument String team_id, @Argument int page, @Argument int limit) {
        org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersResponse response = playerService.getPlayers(team_id, page, limit);
        return response.getPlayersList().stream().map(player -> org.example.apigateway.codegen.types.Player.newBuilder()
                .name(player.getName())
                .age(player.getAge())
                .value(player.getValue())
                .flag(player.getFlag())
                .height(player.getHeight())
                .weight(player.getWeight())
                .id(player.getId())
                .body_type(player.getBodyType())
                .nationality(player.getNationality())
                .overall(player.getOverall())
                .photo(player.getPhoto())
                .potential(player.getPotential())
                .work_rate(player.getWorkRate())
                .preferred_foot(player.getPreferredFoot())
                .international_reputation(player.getInternationalReputation())
                .weak_foot(player.getWeakFoot())
                .skill_moves(player.getSkillMoves())
                .position(player.getPosition())
                .build()).toList();
    }

    @QueryMapping("getPlayer")
    Player getPlayer(@Argument String name) {
        org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayerResponse response = playerService.getPlayer(name);
        return org.example.apigateway.codegen.types.Player.newBuilder()
                .nationality(response.getPlayer().getNationality())
                .overall(response.getPlayer().getOverall())
                .photo(response.getPlayer().getPhoto())
                .potential(response.getPlayer().getPotential())
                .work_rate(response.getPlayer().getWorkRate())
                .preferred_foot(response.getPlayer().getPreferredFoot())
                .international_reputation(response.getPlayer().getInternationalReputation())
                .weak_foot(response.getPlayer().getWeakFoot())
                .skill_moves(response.getPlayer().getSkillMoves())
                .position(response.getPlayer().getPosition())
                .build();
    }

    @QueryMapping("getOffersByPlayer")
    Iterable<Offer> getOffersByPlayer(@Argument String playerId) {
        org.example.apigateway.grpc.player.PlayerOuterClass.GetOffersByPlayerResponse response = playerService.getOffersByPlayer(playerId);
        return response.getOffersList().stream().map(offer -> org.example.apigateway.codegen.types.Offer.newBuilder()
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

    @MutationMapping("createPlayer")
    Player createPlayer(@Argument PlayerInput playerInput) {
        org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerResponse response = playerService.createPlayer(playerInput);
        return org.example.apigateway.codegen.types.Player.newBuilder()
                .id(response.getPlayer().getId())
                .build();
    }

    @MutationMapping("updatePlayer")
    Player updatePlayer(@Argument PlayerInput playerInput) {
        org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerResponse response = playerService.updatePlayer(playerInput);
        return org.example.apigateway.codegen.types.Player.newBuilder()
                .id(response.getPlayer().getId())
                .build();
    }

    @MutationMapping("deletePlayer")
    Player deletePlayer(@Argument String id) {
        org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerResponse response = playerService.deletePlayer(id);
        return org.example.apigateway.codegen.types.Player.newBuilder()
                .id(response.getId())
                .build();
    }

}
