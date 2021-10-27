package com.rk.service;

import java.util.Optional;

import com.rk.entity.User;

public interface IUserService {

	Long saveUser(User user);
	
	Optional<User> findByUsername(String username);
	
}
