package com.mobileprogramming.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mobileprogramming.model.User;
import com.mobileprogramming.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService usersService;
	
	@RequestMapping("/consumers")
	public List<User> getAllUsers()
	{
		return usersService.getAllUsers();
	}
	
	@RequestMapping("/consumers/{id}")
	public Optional<User> getCandid( @PathVariable Integer id)
	{
		return usersService.getUser(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/consumers")
	public void addUser(@RequestBody User user)
	{
		usersService.saveUser(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/consumers/{id}")
	public void updateUser(@RequestBody User user, @PathVariable Integer id)
	{
		usersService.updateUser(id, user);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value="/consumers/{id}")
	public void deleteUser(@PathVariable Integer id)
	{
		usersService.deleteUser(id);
	}
	

}
