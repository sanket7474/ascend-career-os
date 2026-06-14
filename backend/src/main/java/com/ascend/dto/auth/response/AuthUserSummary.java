package com.ascend.dto.auth.response;

import java.util.Set;

public record AuthUserSummary(
        Long userId,
        String email,
        String firstName,
        String lastName,
        Set<String> roles
) {
}
