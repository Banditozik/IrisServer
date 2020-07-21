package com.iris.authentication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class AuthenticationValidationException extends RuntimeException {

    public AuthenticationValidationException(String message) {
        super(message);
    }
}
