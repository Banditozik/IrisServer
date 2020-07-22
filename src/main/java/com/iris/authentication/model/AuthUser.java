package com.iris.authentication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class AuthUser {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String userName;

    private String password;

    private String irisMark;


    public String getUserName() {
        return userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
