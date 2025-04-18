package com.filestorageservice.auth;

public record AuthenticationRequest(
        String username,
        String password
) {
}
