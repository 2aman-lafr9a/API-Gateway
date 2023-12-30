package org.example.apigateway.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.example.apigateway.grpc.team.TeamGrpc;
import org.example.apigateway.grpc.team.TeamOuterClass;

@Service
@AllArgsConstructor
public class TeamService {

    private TeamGrpc.TeamBlockingStub team_blockingStub;

    public TeamOuterClass.GetTeamsResponse getTeams() {
        return team_blockingStub.getTeams(org.example.apigateway.grpc.team.TeamOuterClass.GetTeamsRequest.newBuilder()
                .build());
    }

    public TeamOuterClass.GetTeamResponse getTeam(String name) {
        return team_blockingStub.getTeam(org.example.apigateway.grpc.team.TeamOuterClass.GetTeamRequest.newBuilder()
                .setId(name)
                .build());
    }

    public TeamOuterClass.CreateTeamResponse createTeam(String name, String description, String date) {
        return team_blockingStub.createTeam(org.example.apigateway.grpc.team.TeamOuterClass.CreateTeamRequest.newBuilder()
                .setName(name)
                .setDescription(description)
                .build());
    }

    public TeamOuterClass.UpdateTeamResponse updateTeam(String id, String name, String description, String date) {
        return team_blockingStub.updateTeam(org.example.apigateway.grpc.team.TeamOuterClass.UpdateTeamRequest.newBuilder()
                .setId(id)
                .setName(name)
                .setDescription(description)
                .build());
    }

    public TeamOuterClass.DeleteTeamResponse deleteTeam(String id) {
        return team_blockingStub.deleteTeam(org.example.apigateway.grpc.team.TeamOuterClass.DeleteTeamRequest.newBuilder()
                .setId(id)
                .build());
    }
}