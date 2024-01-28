package org.example.apigateway.service;

import lombok.AllArgsConstructor;
import org.example.apigateway.grpc.agency.AgencyOuterClass;
import org.example.apigateway.grpc.offer.OfferOuterClass;
import org.springframework.stereotype.Service;
import org.example.apigateway.grpc.player.PlayerGrpc;
import org.example.apigateway.grpc.player.PlayerOuterClass;
import org.example.apigateway.codegen.types.PlayerInput;

@Service
@AllArgsConstructor
public class PlayerService {

    private PlayerGrpc.PlayerBlockingStub player_blockingStub;

    public PlayerOuterClass.GetPlayersResponse getPlayers(String team_id , int page, int limit) {
        return player_blockingStub.getPlayers(PlayerOuterClass.GetPlayersRequest.newBuilder()
                        .setTeamId(team_id)
                        .setPage(page)
                        .setLimit(limit)
                        .build());
    }

    public PlayerOuterClass.GetPlayerResponse getPlayer(String name) {
        return player_blockingStub.getPlayer(PlayerOuterClass.GetPlayerRequest.newBuilder()
                .setId(name)
                .build());
    }

    public OfferOuterClass.OfferItem getRecommendedOffer(String id) {
        return player_blockingStub.getRecommendedOffer(PlayerOuterClass.GetPlayerRequest.newBuilder()
                .setId(id)
                .build());
    }

    public PlayerOuterClass.CreatePlayerResponse createPlayer(PlayerInput player) {
          return player_blockingStub.createPlayer(PlayerOuterClass.CreatePlayerRequest.newBuilder()
                    .setPlayer(PlayerOuterClass.PlayerItem.newBuilder()
                            .setName(player.getName())
                            .setAge(player.getAge())
                            .setValue(player.getValue())
                            .setFlag(player.getFlag())
                            .setHeight(player.getHeight())
                            .setWeight(player.getWeight())
                            .setNationality(player.getNationality())
                            .setOverall(player.getOverall())
                            .setPhoto(player.getPhoto())
                            .setPotential(player.getPotential())
                            .setWorkRate(player.getWork_rate())
                            .setPreferredFoot(player.getPreferred_foot())
                            .setInternationalReputation(player.getInternational_reputation())
                            .setWeakFoot(player.getWeak_foot())
                            .setSkillMoves(player.getSkill_moves())
                            .setPosition(player.getPosition())
                            .build())
                    .build());
    }

    public PlayerOuterClass.UpdatePlayerResponse updatePlayer(PlayerInput player) {
        return player_blockingStub.updatePlayer(PlayerOuterClass.UpdatePlayerRequest.newBuilder()
                .setPlayer(PlayerOuterClass.PlayerItem.newBuilder()
                        .setName(player.getName())
                        .setAge(player.getAge())
                        .setValue(player.getValue())
                        .setFlag(player.getFlag())
                        .setHeight(player.getHeight())
                        .setWeight(player.getWeight())
                        .setNationality(player.getNationality())
                        .setOverall(player.getOverall())
                        .setPhoto(player.getPhoto())
                        .setPotential(player.getPotential())
                        .setWorkRate(player.getWork_rate())
                        .setPreferredFoot(player.getPreferred_foot())
                        .setInternationalReputation(player.getInternational_reputation())
                        .setWeakFoot(player.getWeak_foot())
                        .setSkillMoves(player.getSkill_moves())
                        .setPosition(player.getPosition())
                        .build())
                .build());
    }

    public PlayerOuterClass.DeletePlayerResponse deletePlayer(String id) {
        return player_blockingStub.deletePlayer(PlayerOuterClass.DeletePlayerRequest.newBuilder()
                .setId(id)
                .build());
    }

    public PlayerOuterClass.GetOffersByPlayerResponse getOffersByPlayer(String playerId) {
        return player_blockingStub.getOffersByPlayer(PlayerOuterClass.GetOffersByPlayerRequest.newBuilder()
                .setPlayerId(playerId)
                .build());
    }
}
