package com.iris.authentication.service;

import com.iris.authentication.model.AuthCredentials;
import com.iris.authentication.model.AuthUser;
import com.iris.authentication.repository.AuthUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Arrays;

@Service
public class AuthenticationService {

    @Autowired
    AuthUserRepository authUserRepository;


    public String authenticate(AuthCredentials authCredentials){
        final String[] response = new String[1];

         authUserRepository.findAll().forEach(user -> {
            if(user.getPassword().equals(authCredentials.getPassword()) || user.getIrisMark().equals(authCredentials.getIrisMark())){
                response[0] = "Authentication successful";
            }
        });

         if(Arrays.equals(response, new String[1])){
             return "Authentication failed user not found";
         }

         return response[0];

   }

    public String registration(AuthCredentials authCredentials){
        AuthUser authUser = new AuthUser();


        authUser.setUserName(authCredentials.getUserName());
        authUser.setPassword(authCredentials.getPassword());
        authUser.setIrisMark(authCredentials.getIrisMark());
        authUserRepository.save(authUser);

        return "Registration successful";
    }
}
