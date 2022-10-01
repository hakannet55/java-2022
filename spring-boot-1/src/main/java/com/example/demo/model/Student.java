package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    Student() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "snf", nullable = false, length = 50)
    private String snf;

    public Student(String name, String lastName, String snf) {
        this.name = name;
        this.lastName = lastName;
        this.snf = snf;
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

    public String getSnf() {
        // TODO Auto-generated method stub
        return this.snf;
    }

    public void setSnf(String snf) {
        // TODO Auto-generated method stub
        this.snf = snf;
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