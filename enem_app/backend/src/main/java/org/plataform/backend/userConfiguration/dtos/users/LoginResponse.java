package org.plataform.backend.userConfiguration.dtos.users;

public record LoginResponse(
        String accessToken,
        String refreshToken,
        String tokenType,
        Long expiresIn,
        UserResponse user
) {}
