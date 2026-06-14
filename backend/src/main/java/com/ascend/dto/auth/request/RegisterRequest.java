package com.ascend.dto.auth.request;

public record RegisterRequest(
        String email,
        String password,
        String firstName,
        String lastName
) {
}
