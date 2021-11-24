package com.questioner.resourceserver.web.api.response;

import lombok.Data;

import java.util.List;

@Data
public class JwtResponse {
    private String token;
    private String type;
    private String id;
    private String username;
    private String email;
    private List<String> roles;

    public JwtResponse(String token, String id, String username, String email, List<String> roles) {
        this.token = token;
        this.type = "Bearer ";
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }
}
