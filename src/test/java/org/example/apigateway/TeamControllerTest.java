package org.example.apigateway;

import org.example.apigateway.codegen.types.Team;
import org.example.apigateway.controllers.TeamController;
import org.example.apigateway.grpc.team.TeamOuterClass;
import org.example.apigateway.service.TeamService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static graphql.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TeamControllerTest {

    @Mock
    private TeamService teamService;

    @InjectMocks
    private TeamController teamController;

    @Test
    public void testCreateTeam() throws Exception {
        Team team = Team.newBuilder().name("testTeam").build();
        TeamOuterClass.CreateTeamResponse response = TeamOuterClass.CreateTeamResponse.newBuilder().build();
        when(teamService.createTeam("testTeam","testDescription","testOwner","testLogo","testplayers")).thenReturn(null);

        Team result = teamController.createTeam("testTeam","testDescription","testOwner","testLogo","testplayers");

        assertNotNull(result);
        assertEquals(result.getName(), "testTeam");
        verify(teamService, times(1)).createTeam("testTeam","testDescription","testOwner","testLogo","testplayers");
    }

    @Test
    public void testGetTeam() throws Exception {
        Team team = Team.newBuilder().name("testTeam").build();
        TeamOuterClass.GetTeamResponse response = TeamOuterClass.GetTeamResponse.newBuilder().build();
        when(teamService.getTeam("testTeam")).thenReturn(null);

        Team result = teamController.getTeam("testTeam");

        assertNotNull(result);
        assertEquals(result.getName(), "testTeam");
        verify(teamService, times(1)).getTeam("testTeam");
    }

    @Test
    public void testGetTeams() throws Exception {
        TeamOuterClass.GetTeamsResponse response = TeamOuterClass.GetTeamsResponse.newBuilder().build();
        when(teamService.getTeams()).thenReturn(null);

        Iterable<Team> result = teamController.getTeams();

        assertNotNull(result);
        assertEquals(result.iterator().next().getName(), "testTeam");
        verify(teamService, times(1)).getTeams();
    }

    @Test
    public void testUpdateTeam() throws Exception {
        Team team = Team.newBuilder().name("testTeam").build();
        TeamOuterClass.UpdateTeamResponse response = TeamOuterClass.UpdateTeamResponse.newBuilder().build();
        when(teamService.updateTeam("testTeam","testDescription","testOwner","testLogo")).thenReturn(null);

        Team result = teamController.updateTeam("testTeam","testDescription","testOwner","testLogo","testLogo","testplayers");

        assertNotNull(result);
        assertEquals(result.getName(), "testTeam");
        verify(teamService, times(1)).updateTeam("testTeam","testDescription","testOwner","testLogo");
    }

    @Test
    public void testDeleteTeam() throws Exception {
        Team team = Team.newBuilder().name("testTeam").build();
        TeamOuterClass.DeleteTeamResponse response = TeamOuterClass.DeleteTeamResponse.newBuilder().build();
        when(teamService.deleteTeam("testTeam")).thenReturn(null);

        Team result = teamController.deleteTeam("testTeam");

        assertNotNull(result);
        assertEquals(result.getName(), "testTeam");
        verify(teamService, times(1)).deleteTeam("testTeam");
    }
}
