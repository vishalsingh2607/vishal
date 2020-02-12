package com.mobileprogramming.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileprogramming.dao.UserRepository;
import com.mobileprogramming.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	// Get All Users
	public List<User> getAllUsers() {
		List<User> list = new ArrayList<User>();
		userRepository.findAll().forEach(list::add);
		return list;

	}

	// Get User By Id
	public Optional<User> getUser(Integer id) {
		return userRepository.findById(id);

	}

	// Create
	public void saveUser(User user) {
		userRepository.save(user);
	}

	// Update

	public void updateUser(Integer id, User user) {
		userRepository.save(user);
	}

	// Delete
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}

}
