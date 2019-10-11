//package com.familyforum.builder;
//
//import com.familyforum.model.User;
//
//public class UserBuilder {
//
//	public UserBuilder() {
//		// TODO Auto-generated constructor stub
//	}
//	private Long id;
//	private String username;
//	private String password;
//	private String firstname;
//	private String lastname;
//	private String emailid;
//	private String phonenumber;
//	private User user;
//	
//	public UserBuilder(User user){
//		this.user = user;
//	}
//		
//	public User build(){
//		User user = new User(id, username, password, firstname, lastname, emailid, phonenumber);
//		return user;
//	}
//	
//	public UserBuilder setId(Long id) {
//		this.id = id;
//		return this;
//	}
//	public UserBuilder setUsername(String username) {
//		this.username = username;
//		return this;
//	}
//	public UserBuilder setPassword(String password) {
//		this.password = password;
//		return this;
//	}
//	public UserBuilder setFirstname(String firstname) {
//		this.firstname = firstname;
//		return this;
//	}
//	public UserBuilder setLastname(String lastname) {
//		this.lastname = lastname;
//		return this;
//		
//	}
//	public UserBuilder setEmailid(String emailid) {
//		this.emailid = emailid;
//		return this;
//	}
//	public UserBuilder setPhonenumber(String phonenumber) {
//		this.phonenumber = phonenumber;
//		return this;
//	}
//}
//
