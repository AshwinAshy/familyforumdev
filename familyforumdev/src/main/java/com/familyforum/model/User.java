package com.familyforum.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;

	private String firstname;
	private String middlename;
	private String lastname;
	private String emailaddress;
	private String nickname;
	private String gender;
	private String hobbies;
	private String phonenumber;
	private String username;
	private String password;

	public User() {}
	
	public User(User user) {
		this.id = user.getId();
		this.firstname = user.getFirstname();
		this.middlename = user.middlename;
		this.lastname = user.getLastname();
		this.emailaddress = user.getEmailaddress();
		this.nickname = user.getNickname();
		this.gender = user.getGender();
		this.hobbies = user.getHobbies();
		this.phonenumber = user.getPhonenumber();
		this.username = user.getUsername();
		this.password = user.getPassword();
	}

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<MyActivity> myActivitiesList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<MyActivity> getMyActivitiesList() {
		return myActivitiesList;
	}

	public void setMyActivitiesList(List<MyActivity> myActivitiesList) {
		this.myActivitiesList = myActivitiesList;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname
				+ ", emailaddress=" + emailaddress + ", nickname=" + nickname + ", gender=" + gender + ", hobbies="
				+ hobbies + ", phonenumber=" + phonenumber + ", username=" + username + ", password=" + password + "]";
	}

}
