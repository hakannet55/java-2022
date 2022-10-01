package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "ders")
public class Ders {
    Ders() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "shortCode", nullable = false, length = 50)
    private String shortCode;

    @Column(name = "user", nullable = false, length = 50)
    private String user;

    public Ders(String name, String shortCode, String user) {
        this.name = name;
        this.shortCode = shortCode;
        this.user = user;
    }

    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }

    public String getUser() {
        // TODO Auto-generated method stub
        return this.user;
    }

    public String getShortCode() {
        // TODO Auto-generated method stub
        return this.shortCode;
    }

    public Long getId() {
        // TODO Auto-generated method stub
        return this.id;
    }

    public void setUser(String user) {
        // TODO Auto-generated method stub
        this.user = user;
    }

    public void setName(String name) {
        // TODO Auto-generated method stub
        this.name = name;
    }

    public void setShortCode(String shortCode) {
        // TODO Auto-generated method stub
        this.shortCode = shortCode;
    }


}