package com.auth0.dto.api.v2.users;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class AssignRolesToAUserRequest {

    public List<String> roles = new ArrayList<>();
}
