package com.auth0.dto.api.v2.users;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.g.g.userwrapper.adapter.users.dto.commons.AppMetadata;
import com.g.g.userwrapper.adapter.users.dto.commons.UserMetadata;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateUserRequest {

    @JsonProperty("email")
    private String email;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("user_metadata")
    private UserMetadata userMetadata;

    @JsonProperty("blocked")
    private Boolean blocked;

    @JsonProperty("email_verified")
    private Boolean emailVerified;

    @JsonProperty("phone_verified")
    private Boolean phoneVerified;

    @JsonProperty("app_metadata")
    private AppMetadata appMetadata;

    @JsonProperty("given_name")
    private String givenName;

    @JsonProperty("family_name")
    private String familyName;

    @JsonProperty("name")
    private String name;

    @JsonProperty("nickname")
    private String nickname;

    @JsonProperty("picture")
    private String picture;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("connection")
    private String connection;

    @JsonProperty("password")
    private String password;

    @JsonProperty("verify_email")
    private Boolean verifyEmail;

    @JsonProperty("username")
    private String username;

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("email", email)
                .append("phoneNumber", phoneNumber)
                .append("userMetadata", userMetadata)
                .append("blocked", blocked)
                .append("emailVerified", emailVerified)
                .append("phoneVerified", phoneVerified)
                .append("appMetadata", appMetadata)
                .append("givenName", givenName)
                .append("familyName", familyName)
                .append("name", name)
                .append("nickname", nickname)
                .append("picture", picture)
                .append("userId", userId)
                .append("connection", connection)
                .append("password", "XXX")
                .append("verifyEmail", verifyEmail)
                .append("username", username)
                .toString();
    }
}
