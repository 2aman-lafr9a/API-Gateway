package org.example.apigateway.controllers;

import org.example.apigateway.codegen.types.Player;
import org.example.apigateway.codegen.types.PlayerInput;
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
    public Iterable<org.example.apigateway.codegen.types.Player> getPlayers() {
        org.example.apigateway.grpc.player.PlayerOuterClass.GetPlayersResponse response = playerService.getPlayers();
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
    public Player getPlayer(@Argument String name){
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

    @MutationMapping("createPlayer")
    public Player createPlayer(@Argument PlayerInput player) {
        org.example.apigateway.grpc.player.PlayerOuterClass.CreatePlayerResponse response = playerService.createPlayer(player);
        return org.example.apigateway.codegen.types.Player.newBuilder()
                .id(response.getPlayer().getId())
                .build();
    }

    @MutationMapping("updatePlayer")
    public Player updatePlayer(@Argument PlayerInput player) {
        org.example.apigateway.grpc.player.PlayerOuterClass.UpdatePlayerResponse response = playerService.updatePlayer(player);
        return org.example.apigateway.codegen.types.Player.newBuilder()
                .id(response.getPlayer().getId())
                .build();
    }

    @MutationMapping("deletePlayer")
    public Player deletePlayer(@Argument String id) {
        org.example.apigateway.grpc.player.PlayerOuterClass.DeletePlayerResponse response = playerService.deletePlayer(id);
        return org.example.apigateway.codegen.types.Player.newBuilder()
                .id(response.getId())
                .build();
    }

}
