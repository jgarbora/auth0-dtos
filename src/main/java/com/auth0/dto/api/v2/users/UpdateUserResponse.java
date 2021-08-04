package com.auth0.dto.api.v2.users;

import com.auth0.dto.api.v2.commons.AppMetadata;
import com.auth0.dto.api.v2.commons.UserMetadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateUserResponse {

    @JsonProperty("email")
    public String email;

    @JsonProperty("phone_number")
    public String phoneNumber;

    @JsonProperty("user_metadata")
    public UserMetadata userMetadata;

    @JsonProperty("blocked")
    public Boolean blocked;

    @JsonProperty("email_verified")
    public Boolean emailVerified;

    @JsonProperty("phone_verified")
    public Boolean phoneVerified;

    @JsonProperty("app_metadata")
    public AppMetadata appMetadata;

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
