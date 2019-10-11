package com.familyforum.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MyActivity {

	public MyActivity() {}

	@Id
	@GeneratedValue
	private Long myActID;
	private String date;
	private String hours;
	private String minutes;
	private String seconds;
	private String comments;
	
	@ManyToOne
	@JoinColumn(name="id")
	private User user;

	@ManyToOne
	@JoinColumn(name="actid")
	private ActivityType activityType;
	
	public Long getMyActID() {
		return myActID;
	}

	public void setMyActID(Long myActID) {
		this.myActID = myActID;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getMinutes() {
		return minutes;
	}

	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}

	public String getSeconds() {
		return seconds;
	}

	public void setSeconds(String seconds) {
		this.seconds = seconds;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ActivityType getActivityType() {
		return activityType;
	}

	public void setActivityType(ActivityType activityType) {
		this.activityType = activityType;
	}

	@Override
	public String toString() {
		return "MyActivity [myActID=" + myActID + ", date=" + date + ", hours=" + hours + ", minutes=" + minutes
				+ ", seconds=" + seconds + ", comments=" + comments + ", user=" + user + ", activityType="
				+ activityType + "]";
	}
	
	

}
