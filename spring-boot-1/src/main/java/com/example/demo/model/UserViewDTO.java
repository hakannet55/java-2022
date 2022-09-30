package com.example.demo.model;

import java.io.Serializable;

import lombok.Getter;

@Getter
public class UserViewDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;
    private final String lastName;
    private final String yetki;

    private UserViewDTO(String name, String lastName, String yetki) {
        this.name = name;
        this.lastName = lastName;
        this.yetki = yetki;
    }

    public static User of(User user) {
        return user;
    }
}
