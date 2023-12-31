package org.example.apigateway.dto;


import lombok.Getter;
import org.jetbrains.annotations.NotNull;

@Getter
@NotNull
public class UserSignIn {
    private String userName;
    private String password;
}
