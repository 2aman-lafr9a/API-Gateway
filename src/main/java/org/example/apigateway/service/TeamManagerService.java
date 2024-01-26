package org.example.apigateway.service;

import lombok.AllArgsConstructor;
import org.example.apigateway.grpc.teamManager.TeamManagerGrpc;
import org.example.apigateway.grpc.teamManager.TeamManagerOuterClass;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TeamManagerService {

    private TeamManagerGrpc.TeamManagerBlockingStub teamManager_blockingStub;

    public TeamManagerOuterClass.GetTeamManagersResponse getTeamManagers() {
        return teamManager_blockingStub.getTeamManagers(TeamManagerOuterClass.GetTeamManagersRequest.newBuilder()
                .build());
    }

    public TeamManagerOuterClass.GetTeamManagerResponse getTeamManager(String id) {
        return teamManager_blockingStub.getTeamManager(TeamManagerOuterClass.GetTeamManagerRequest.newBuilder()
                .setId(Integer.parseInt(id))
                .build());
    }

    public TeamManagerOuterClass.CreateTeamManagerResponse createTeamManager(String name, String surname, String age, String team) {
        return teamManager_blockingStub.createTeamManager(TeamManagerOuterClass.CreateTeamManagerRequest.newBuilder()
                .setName(name)
                .setSurname(surname)
                .setAge(age)
                .setTeamId(team)
                .build());
    }

    public TeamManagerOuterClass.UpdateTeamManagerResponse updateTeamManager(String id, String name, String surname, String age, String team) {
        return teamManager_blockingStub.updateTeamManager(TeamManagerOuterClass.UpdateTeamManagerRequest.newBuilder()
                .setId(Integer.parseInt(id))
                .setName(name)
                .setSurname(surname)
                .setAge(age)
                .setTeamId(team)
                .build());
    }

    public TeamManagerOuterClass.DeleteTeamManagerResponse deleteTeamManager(String id) {
        return teamManager_blockingStub.deleteTeamManager(TeamManagerOuterClass.DeleteTeamManagerRequest.newBuilder()
                .setId(Integer.parseInt(id))
                .build());
    }
}
