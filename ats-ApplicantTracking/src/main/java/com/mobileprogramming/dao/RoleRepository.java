package com.mobileprogramming.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobileprogramming.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
