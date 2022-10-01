package com.example.demo.service;

import com.example.demo.model.Ders;
import com.example.demo.model.User;
import com.example.demo.model.UserCreateDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DersService {

	Ders getUserById(Long id);

	List<Ders> getUserList();

	Ders createUser(Ders ders);

	Ders updateUser(Long id, Ders user);

	void deleteUser(Long id);

}
