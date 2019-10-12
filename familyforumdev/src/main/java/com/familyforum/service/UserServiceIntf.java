package com.familyforum.service;

import java.util.List;
import java.util.Optional;

import com.familyforum.model.User;

public interface UserServiceIntf {

	void saveUser(User user);
	
	List<User> getUserList();
	
	User getUserByID(Long id);
	
	Optional<User> getUserByName(String name);
	
	void deleteUserByID(Long id);
	
	void updateUser(User user);
}
