package com.iris.authentication.controller;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;

import com.iris.authentication.model.AuthCredentials;
import com.iris.authentication.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IrisAuthenticationController {

    @Autowired
    AuthenticationService authenticationService;

    @RequestMapping(value = "/authentication", method = RequestMethod.POST)
    public String processIrisAuthentication(@Valid @RequestBody AuthCredentials authCredentials) {
        if (authCredentials == null) {
            throw new RuntimeException("Request mapping failed");
        }
        return authenticationService.authenticate(authCredentials);
    }


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

}
