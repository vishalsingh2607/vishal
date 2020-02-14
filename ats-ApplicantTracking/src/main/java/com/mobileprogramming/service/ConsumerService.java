package com.mobileprogramming.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileprogramming.dao.UserRepository;
import com.mobileprogramming.dao.ConsumerRepository;
import com.mobileprogramming.model.UserDao;
import com.mobileprogramming.model.Consumer;

@Service
public class ConsumerService {

	@Autowired
	private ConsumerRepository usersRepository;

	// Get All Users
	public List<Consumer> getAllUsers() {
		List<Consumer> list = new ArrayList<Consumer>();
		usersRepository.findAll().forEach(list::add);
		return list;

	}

	// Get User By Id
	public Optional<Consumer> getUser(Integer id) {
		return usersRepository.findById(id);

	}

	// Create
	public void saveUser(Consumer user) {
		usersRepository.save(user);
	}

	// Update

	public void updateUser(Integer id, Consumer user) {
		usersRepository.save(user);
	}

	// Delete
	public void deleteUser(Integer id) {
		usersRepository.deleteById(id);
	}

}
