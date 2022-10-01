package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.model.User;
import com.example.demo.model.UserCreateDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentService {

    Student getUserById(Long id);

    List<Student> getUserList();

    Student createUser(Student userCreateDTO);

    Student updateUser(Long id, Student user);

    void deleteUser(Long id);

    List<Student> slice(Pageable pageable);

}
