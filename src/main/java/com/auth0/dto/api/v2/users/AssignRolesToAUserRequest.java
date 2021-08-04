package com.auth0.dto.api.v2.users;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssignRolesToAUserRequest {

    public List<String> roles = new ArrayList<>();
}
