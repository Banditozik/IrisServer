package com.iris.authentication.service;

import com.iris.authentication.model.AuthCredentials;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {


    public String authenticate(AuthCredentials authCredentials){
        //Call to database here
        return "Authenticated";
    }
}
