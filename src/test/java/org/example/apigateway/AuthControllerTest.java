package org.example.apigateway;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.apigateway.controllers.AuthController;
import org.example.apigateway.dto.UserSignIn;
import org.example.apigateway.dto.UserSignUp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AuthController.class)
@AutoConfigureMockMvc
public class AuthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testSignUp() throws Exception {
        UserSignUp userSignUp = new UserSignUp();
        userSignUp.setUserName("testUser");
        userSignUp.setPassword("testPassword");
        userSignUp.setRole("testRole");

        mockMvc.perform(post("/signUp")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(userSignUp)))
                .andExpect(status().isOk());
    }

    @Test
    public void testSignIn() throws Exception {
        UserSignIn userSignIn = new UserSignIn();
        userSignIn.setUserName("testUser");
        userSignIn.setPassword("testPassword");

        MvcResult result = mockMvc.perform(post("/signIn")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(userSignIn)))
                .andExpect(status().isOk())
                .andReturn();

        String responseBody = result.getResponse().getContentAsString();
        Map<String, String> responseMap = objectMapper.readValue(responseBody, new TypeReference<>() {
        });

        String jwt = responseMap.get("jwt");
        assertFalse(jwt.isEmpty(), "JWT should not be empty");
        assertEquals("true", responseMap.get("success"), "Success should be true");


        // test with invalid credentials
        userSignIn.setUserName("invalidUser");
        userSignIn.setPassword("invalidPassword");
        mockMvc.perform(post("/signIn")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(userSignIn)))
                .andExpect(status().isUnauthorized());


    }

}