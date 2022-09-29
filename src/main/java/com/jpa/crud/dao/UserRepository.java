package com.jpa.crud.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.crud.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	

}
