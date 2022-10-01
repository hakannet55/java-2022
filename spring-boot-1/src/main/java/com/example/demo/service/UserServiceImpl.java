package com.example.demo.service;

import com.example.demo.model.UserCreateDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.model.UserRepository;
import com.example.demo.model.UserViewDTO;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User getUserById(Long id) {
		final User user = userRepository.findById(id).orElseThrow(() -> new NotFoundException("Not Found Exception"));
		return UserViewDTO.of(user);
	}

	@Override
	public List<User> getUserList() {
		return userRepository.findAll().stream().map(UserViewDTO::of).collect(Collectors.toList());
	}

	@Override
	public User createUser(UserCreateDTO userCreateDTO) {
		final User user = userRepository.save(new User(userCreateDTO.getName(), userCreateDTO.getLastName(), userCreateDTO.getYetki()));
		return UserViewDTO.of(user);
	}

	@Override
	public User updateUser(Long id, User userCreateDTO) {
		final User user = userRepository.findById(id).orElseThrow(() -> new NotFoundException("Not Found Exception"));

		user.setName(userCreateDTO.getName());
		user.setLastName(userCreateDTO.getLastName());
		user.setYetki(userCreateDTO.getYetki());
		final User updatedUser = userRepository.save(user);

		return UserViewDTO.of(updatedUser);
	}

	@Override
	public void deleteUser(Long id) {
		final User user = userRepository.findById(id).orElseThrow(() -> new NotFoundException("Not Found Exception"));
		userRepository.deleteById(user.getId());
	}

	@Override
	public List<User> slice(Pageable pageable) {
		return userRepository.findAll(pageable).stream().map(UserViewDTO::of).collect(Collectors.toList());
	}


}
