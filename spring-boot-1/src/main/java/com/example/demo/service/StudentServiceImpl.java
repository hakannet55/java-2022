package com.example.demo.service;

import com.example.demo.model.*;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public Student getUserById(Long id) {
		final Student user = studentRepository.findById(id).orElseThrow(() -> new NotFoundException("Not Found Exception"));
		return user;
	}

	@Override
	public List<Student> getUserList() {
		return new ArrayList<Student>(studentRepository.findAll());
	}

	@Override
	public Student createUser(Student userCreateDTO) {
		Student stu = new Student(userCreateDTO.getName(), userCreateDTO.getLastName(), userCreateDTO.getSnf());
		final Student user = studentRepository.save(stu);
		return stu;
	}

	@Override
	public Student updateUser(Long id, Student userCreateDTO) {
		final Student user = studentRepository.findById(id).orElseThrow(() -> new NotFoundException("Not Found Exception"));
		user.setName(userCreateDTO.getName());
		user.setLastName(userCreateDTO.getLastName());
		user.setSnf(userCreateDTO.getSnf());
		final Student updatedUser = studentRepository.save(user);
		return updatedUser;
	}

	@Override
	public void deleteUser(Long id) {
		final Student user = studentRepository.findById(id).orElseThrow(() -> new NotFoundException("Not Found Exception"));
		studentRepository.deleteById(user.getId());
	}

	@Override
	public List<Student> slice(Pageable pageable) {
		return studentRepository.findAll(pageable).stream().collect(Collectors.toList());
	}


}
