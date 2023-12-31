package org.example.apigateway.controllers;

import org.example.apigateway.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.example.apigateway.grpc.team.TeamOuterClass;
import org.example.apigateway.codegen.types.Team;

@Controller
public class TeamController {

    TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @QueryMapping("getTeams")
    Iterable<Team> getTeams() {
        TeamOuterClass.GetTeamsResponse response = teamService.getTeams();
        return response.getTeamsList().stream().map(team -> org.example.apigateway.codegen.types.Team.newBuilder()
                .id(team.getId())
                .name(team.getName())
                .description(team.getDescription())
                .owner(team.getOwner())
                .build()).toList();
    }

    @QueryMapping("getTeam")
    Team getTeam(@Argument String name) {
        TeamOuterClass.GetTeamResponse response = teamService.getTeam(name);
        return org.example.apigateway.codegen.types.Team.newBuilder()
                .id(response.getId())
                .name(response.getName())
                .description(response.getDescription())
                .owner(response.getOwner())
                .build();
    }

    @MutationMapping("createTeam")
    Team createTeam(@Argument String name,@Argument String description,@Argument String owner, @Argument String teamLogo, @Argument String players) {
        TeamOuterClass.CreateTeamResponse response = teamService.createTeam(name, description, owner, teamLogo, players);
        return org.example.apigateway.codegen.types.Team.newBuilder()
                .id(response.getId())
                .build();
    }

    @MutationMapping("updateTeam")
    Team updateTeam(@Argument String id,@Argument String name,@Argument String description,@Argument String owner, @Argument String teamLogo, @Argument String players) {
        TeamOuterClass.UpdateTeamResponse response = teamService.updateTeam(id, name, description, owner);
        return org.example.apigateway.codegen.types.Team.newBuilder()
                .id(response.getId())
                .build();
    }

    @MutationMapping("deleteTeam")
    Team deleteTeam(@Argument String id) {
        TeamOuterClass.DeleteTeamResponse response = teamService.deleteTeam(id);
        return org.example.apigateway.codegen.types.Team.newBuilder()
                .id(response.getId())
                .build();
    }
}
