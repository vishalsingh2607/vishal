package com.mobileprogramming.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobileprogramming.model.Consumer;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Integer>{

}
