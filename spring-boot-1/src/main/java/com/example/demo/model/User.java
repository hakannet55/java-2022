package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;

@Entity
@Table(name = "users")
public class User {
    User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "yetki", nullable = false, length = 50)
    private String yetki;

    public User(String name, String lastName, String yetki) {
        this.name = name;
        this.lastName = lastName;
        this.yetki = yetki;
    }

    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }

    public String getLastName() {
        // TODO Auto-generated method stub
        return this.lastName;
    }

    public Long getId() {
        // TODO Auto-generated method stub
        return this.id;
    }

    public String getYetki() {
        // TODO Auto-generated method stub
        return this.yetki;
    }

    public void setYetki(String yetki) {
        // TODO Auto-generated method stub
        this.yetki = yetki;
    }

    public void setName(String name) {
        // TODO Auto-generated method stub
        this.name = name;
    }

    public void setLastName(String lastName) {
        // TODO Auto-generated method stub
        this.lastName = lastName;
    }


}