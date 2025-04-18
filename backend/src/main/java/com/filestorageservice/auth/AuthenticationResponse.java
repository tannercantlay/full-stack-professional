package com.filestorageservice.auth;

import com.filestorageservice.customer.CustomerDTO;

public record AuthenticationResponse (
        String token,
        CustomerDTO customerDTO){
}
