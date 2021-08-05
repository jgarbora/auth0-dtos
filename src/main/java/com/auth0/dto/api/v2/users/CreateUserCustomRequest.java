package com.auth0.dto.api.v2.users;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateUserCustomRequest extends CreateUserRequest {

    @JsonProperty("role")
    public String role;
}
