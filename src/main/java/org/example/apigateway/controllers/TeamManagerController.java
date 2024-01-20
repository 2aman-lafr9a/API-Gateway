package org.example.apigateway.controllers;

import org.example.apigateway.codegen.types.TeamManager;
import org.example.apigateway.grpc.teamManager.TeamManagerOuterClass;
import org.example.apigateway.service.TeamManagerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class TeamManagerController {

    TeamManagerService teamManagerService;

    public TeamManagerController(TeamManagerService teamManagerService) {
        this.teamManagerService = teamManagerService;
    }

    @MutationMapping("createTeamManager")
    public TeamManager createTeamManager(@Argument String name, @Argument String surname, @Argument String age, @Argument String team) {
        TeamManagerOuterClass.CreateTeamManagerResponse response = teamManagerService.createTeamManager(name, surname, age, team);
        return TeamManager.newBuilder()
                .id(response.getTeamManager().getId())
                .build();
    }

    @MutationMapping("updateTeamManager")
    public TeamManager updateTeamManager(@Argument String id, @Argument String name, @Argument String surname, @Argument String age, @Argument String team) {
        TeamManagerOuterClass.UpdateTeamManagerResponse response = teamManagerService.updateTeamManager(id, name, surname, age, team);
        return TeamManager.newBuilder()
                .id(response.getTeamManager().getId())
                .build();
    }

    @MutationMapping("deleteTeamManager")
    public TeamManager deleteTeamManager(@Argument String id) {
        TeamManagerOuterClass.DeleteTeamManagerResponse response = teamManagerService.deleteTeamManager(id);
        return TeamManager.newBuilder()
                .id(response.getId())
                .build();
    }

    @QueryMapping("getTeamManagers")
    public Iterable<TeamManager> getTeamManagers() {
        TeamManagerOuterClass.GetTeamManagersResponse response = teamManagerService.getTeamManagers();
        return response.getTeamManagersList().stream().map(teamManager -> TeamManager.newBuilder()
                .id(teamManager.getId())
                .name(teamManager.getName())
                .surname(teamManager.getSurname())
                .age(teamManager.getAge())
                .team(teamManager.getTeamId())
                .build()).toList();
    }

    @QueryMapping("getTeamManager")
    public TeamManager getTeamManager(@Argument String id) {
        TeamManagerOuterClass.GetTeamManagerResponse response = teamManagerService.getTeamManager(id);
        return TeamManager.newBuilder()
                .id(response.getTeamManager().getId())
                .name(response.getTeamManager().getName())
                .surname(response.getTeamManager().getSurname())
                .age(response.getTeamManager().getAge())
                .team(response.getTeamManager().getTeamId())
                .build();
    }
}
