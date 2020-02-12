package com.mobileprogramming.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mobileprogramming.model.Candidate;
import com.mobileprogramming.model.User;
import com.mobileprogramming.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@RequestMapping("/users/{id}")
	public Optional<User> getCandid( @PathVariable Integer id)
	{
		return userService.getUser(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/users")
	public void addUser(@RequestBody User user)
	{
		userService.saveUser(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/users/{id}")
	public void updateUser(@RequestBody User user, @PathVariable Integer id)
	{
		userService.updateUser(id, user);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value="/users/{id}")
	public void deleteUser(@PathVariable Integer id)
	{
		userService.deleteUser(id);
	}
}
