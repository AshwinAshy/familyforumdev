package com.familyforum.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.familyforum.model.User;
import com.familyforum.repository.UserRepositoryIntf;

@Service
public class UserService implements UserServiceIntf {

	@Autowired
	UserRepositoryIntf userRepository;
	
	public UserService() {}

	@Override
	public void saveUser(User user) {
		userRepository.saveUser(user);
	}

	@Override
	public List<User> getUserList() {		
		return userRepository.getUserList();
	}

	@Override
	public User getUserByID(Long id) {
		return userRepository.getUserByID(id);
	}
	
	@Override
	public Optional<User> getUserByName(String name) {
		return userRepository.getUserByName(name);
	}
	
	@Override
	public void deleteUserByID(Long id) {
		userRepository.deleteUserByID(id);
	}
	
	@Override
	public void updateUser(User user) {
		userRepository.updateUser(user);
	}
}