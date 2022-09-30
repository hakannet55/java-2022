package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.model.UserCreateDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {

	User getUserById(Long id);

	List<User> getUserList();

	User createUser(UserCreateDTO userCreateDTO);

	User updateUser(Long id, User user);

	void deleteUser(Long id);

	List<User> slice(Pageable pageable);

}
