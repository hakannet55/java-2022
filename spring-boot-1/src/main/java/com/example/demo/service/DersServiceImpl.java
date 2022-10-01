package com.example.demo.service;

import com.example.demo.model.Ders;
import com.example.demo.model.DersRepository;
import com.example.demo.model.Student;
import com.example.demo.model.StudentRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DersServiceImpl implements DersService {

	private final DersRepository dersRepository;

	public DersServiceImpl(DersRepository dersRepository) {
		this.dersRepository = dersRepository;
	}

	@Override
	public Ders getUserById(Long id) {
		final Ders user = dersRepository.findById(id).orElseThrow(() -> new NotFoundException("Not Found Exception"));
		return user;
	}

	@Override
	public List<Ders> getUserList() {
		return new ArrayList<Ders>(dersRepository.findAll());
	}

	@Override
	public Ders createUser(Ders userCreateDTO) {
		Ders stu = new Ders(userCreateDTO.getName(), userCreateDTO.getShortCode(), userCreateDTO.getUser());
		final Ders user = dersRepository.save(stu);
		return stu;
	}

	@Override
	public Ders updateUser(Long id, Ders userCreateDTO) {
		final Ders user = dersRepository.findById(id).orElseThrow(() -> new NotFoundException("Not Found Exception"));
		user.setName(userCreateDTO.getName());
		user.setShortCode(userCreateDTO.getShortCode());
		user.setUser(userCreateDTO.getUser());
		final Ders updatedUser = dersRepository.save(user);
		return updatedUser;
	}

	@Override
	public void deleteUser(Long id) {
		final Ders user = dersRepository.findById(id).orElseThrow(() -> new NotFoundException("Not Found Exception"));
		dersRepository.deleteById(user.getId());
	}


}
