package com.auth0.dto.api.v2.users;

import com.auth0.dto.api.v2.commons.AppMetadata;
import com.auth0.dto.api.v2.commons.Identity;
import com.auth0.dto.api.v2.commons.UserMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUserResponse {

    @JsonProperty("user_id")
    public String userId;

    @JsonProperty("email")
    public String email;

    @JsonProperty("email_verified")
    public Boolean emailVerified;

    @JsonProperty("username")
    public String username;

    @JsonProperty("phone_number")
    public String phoneNumber;

    @JsonProperty("phone_verified")
    public Boolean phoneVerified;

    @JsonProperty("created_at")
    public String createdAt;

    @JsonProperty("updated_at")
    public String updatedAt;

    @JsonProperty("identities")
    public List<Identity> identities = null;

    @JsonProperty("app_metadata")
    public AppMetadata appMetadata;

    @JsonProperty("user_metadata")
    public UserMetadata userMetadata;

    @JsonProperty("picture")
    public String picture;

    @JsonProperty("name")
    public String name;

    @JsonProperty("nickname")
    public String nickname;

    @JsonProperty("multifactor")
    public List<String> multifactor = null;

    @JsonProperty("last_ip")
    public String lastIp;

    @JsonProperty("last_login")
    public String lastLogin;

    @JsonProperty("logins_count")
    public Integer loginsCount;

    @JsonProperty("blocked")
    public Boolean blocked;

    @JsonProperty("given_name")
    public String givenName;

    @JsonProperty("family_name")
    public String familyName;
}
