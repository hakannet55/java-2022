package com.example.demo.model;

import lombok.Data;

@Data
public class UserCreateDTO {

    private Number id;
    private String name;

    private String lastName;

    private String yetki;

    public UserCreateDTO(String name, String lastName, String yetki) {
        this.name = name;
        this.lastName = lastName;
        this.yetki = yetki;
    }

    public Number getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getYetki() {
        return this.yetki;
    }
}
