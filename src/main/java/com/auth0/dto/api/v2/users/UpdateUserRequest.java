package com.auth0.dto.api.v2.users;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateUserRequest {

    @JsonProperty("email")
    public String email;

    @JsonProperty("phone_number")
    public String phoneNumber;

    @JsonProperty("user_metadata")
    public Map<String, Object> userMetadata = new HashMap<>();

    @JsonProperty("blocked")
    public Boolean blocked;

    @JsonProperty("email_verified")
    public Boolean emailVerified;

    @JsonProperty("phone_verified")
    public Boolean phoneVerified;

    @JsonProperty("app_metadata")
    public Map<String, Object> appMetadata = new HashMap<>();

    @JsonProperty("given_name")
    public String givenName;

    @JsonProperty("family_name")
    public String familyName;

    @JsonProperty("name")
    public String name;

    @JsonProperty("nickname")
    public String nickname;

    @JsonProperty("picture")
    public String picture;

    @JsonProperty("user_id")
    public String userId;

    @JsonProperty("connection")
    public String connection;

    @JsonProperty("password")
    public String password;

    @JsonProperty("verify_email")
    public Boolean verifyEmail;

    @JsonProperty("username")
    public String username;
}
