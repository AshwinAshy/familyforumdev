package com.familyforum.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.familyforum.model.MyUserDetails;
import com.familyforum.model.User;

@Component
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserServiceIntf userService;

	public MyUserDetailsService() {
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<User> optionalUser = userService.getUserByName(username);

		optionalUser.orElseThrow(()-> new UsernameNotFoundException("Invalid user credentials."));

		return optionalUser.map(MyUserDetails::new).get();
				
	}

}