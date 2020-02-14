package com.mobileprogramming.dao;

import java.util.Optional;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mobileprogramming.model.UserDao;


@Repository
public interface UserRepository extends CrudRepository<UserDao, Long>{
	
	 UserDao findByUsername(String username);
}
