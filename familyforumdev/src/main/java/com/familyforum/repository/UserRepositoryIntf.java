package com.familyforum.repository;

import java.util.List;

import com.familyforum.model.User;

public interface UserRepositoryIntf {

	void saveUser(User user);
	
	List<User> getUserList();
	
	User getUserByID(Long id);
	
	void deleteUserByID(Long id);
	
	void updateUser(User user);
}
