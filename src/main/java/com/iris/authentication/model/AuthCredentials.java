package com.iris.authentication.model;

import javax.validation.constraints.NotBlank;

public class AuthCredentials {

    @NotBlank(message = "UserName is mandatory")
    String userName;

    @NotBlank(message = "Password is mandatory")
    String password;

    @NotBlank(message = "IrisMark is mandatory")
    String irisMark;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIrisMark() {
        return irisMark;
    }

    public void setIrisMark(String irisMark) {
        this.irisMark = irisMark;
    }
}