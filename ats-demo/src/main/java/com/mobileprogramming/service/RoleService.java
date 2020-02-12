package com.mobileprogramming.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileprogramming.dao.CandidateRepository;
import com.mobileprogramming.dao.RoleRepository;
import com.mobileprogramming.model.Candidate;
import com.mobileprogramming.model.Role;

@Service
public class RoleService {
	
	@Autowired
private RoleRepository roleRepository;
	
	//Get All Roles
	public List<Role> getAllRoles()
	{
		List<Role> list=new ArrayList<Role>();
		roleRepository.findAll().forEach(list::add);
		return list;
		
	}
	
	//Get Role By Id
	public Optional<Role> getRole(Integer id)
	{
		return roleRepository.findById(id);
		
	}
	
	//Create
	public void saveRole(Role role)
	{
		roleRepository.save(role);
	}
	
	//Update
	public void updateRole(Integer id,Role role)
	{
		roleRepository.save(role);
	}
	
	//Delete
	public void deleteRole(Integer id)
	{
		roleRepository.deleteById(id);
	}
}
