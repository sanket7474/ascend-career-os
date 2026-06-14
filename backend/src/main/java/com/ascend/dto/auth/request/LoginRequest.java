package com.ascend.dto.auth.request;

public record LoginRequest(
        String email,
        String password
) {
}
