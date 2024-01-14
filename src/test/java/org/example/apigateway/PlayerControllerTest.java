package org.example.apigateway;

import org.example.apigateway.codegen.types.Player;
import org.example.apigateway.codegen.types.PlayerInput;
import org.example.apigateway.controllers.PlayerController;
import org.example.apigateway.service.PlayerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static graphql.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class PlayerControllerTest {

    String name = "John Doe";
    String age = "25";
    String photo = "player.jpg";
    String nationality = "English";
    String flag = "england_flag.jpg";
    int overall = 80;
    int potential = 90;
    String position = "Forward";
    int value = 10000000;
    int wage = 50000;
    String preferredFoot = "Right";
    String workRate = "High/Medium";
    String bodyType = "Lean";
    String internationalReputation = "4";
    String skillMoves = "4";
    String weakFoot = "3";
    int height = 180;
    int weight = 75;

    PlayerInput playerInput = PlayerInput.newBuilder()
            .name(name)
            .age(age)
            .photo(photo)
            .nationality(nationality)
            .flag(flag)
            .overall(overall)
            .potential(potential)
            .position(position)
            .value(value)
            .wage(wage)
            .preferred_foot(preferredFoot)
            .work_rate(workRate)
            .body_type(bodyType)
            .international_reputation(internationalReputation)
            .skill_moves(skillMoves)
            .weak_foot(weakFoot)
            .height(height)
            .weight(weight)
            .build();

    @Mock
    private PlayerService playerService;

    @InjectMocks
    private PlayerController playerController;

    @Test
    public void testCreatePlayer() throws Exception {

        Player result = playerController.createPlayer(playerInput);

        assertNotNull(result);
        assertEquals(result.getName(), name);
        verify(playerService, times(1)).createPlayer(playerInput);
    }

    @Test
    public void testGetPlayer() throws Exception {
        Player player = Player.newBuilder().name(name).build();
        when(playerService.getPlayer(name)).thenReturn(null);

        Player result = playerController.getPlayer(name);

        assertNotNull(result);
        assertEquals(result.getName(), name);
        verify(playerService, times(1)).getPlayer(name);
    }

    @Test
    public void testGetPlayers() throws Exception {
        Iterable<Player> result = playerController.getPlayers();

        assertNotNull(result);
        assertEquals(result.iterator().next().getName(), name);
        verify(playerService, times(1)).getPlayers();
    }

    @Test
    public void testUpdatePlayer() throws Exception {
        Player player = Player.newBuilder().name(name).build();
        when(playerService.updatePlayer(playerInput)).thenReturn(null);

        Player result = playerController.updatePlayer(playerInput);

        assertNotNull(result);
        assertEquals(result.getName(), name);
        verify(playerService, times(1)).updatePlayer(playerInput);
    }

    @Test
    public void testDeletePlayer() throws Exception {
        Player player = Player.newBuilder().name(name).build();
        when(playerService.deletePlayer(name)).thenReturn(null);

        Player result = playerController.deletePlayer(name);

        assertNotNull(result);
        assertEquals(result.getName(), name);
        verify(playerService, times(1)).deletePlayer(name);
    }

}
