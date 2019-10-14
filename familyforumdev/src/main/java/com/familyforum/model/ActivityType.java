package com.familyforum.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class ActivityType {

	@Id
	@GeneratedValue
	private Long actid;
	
	@NotEmpty(message ="{field.empty}")
	private String activitytype;

	@OneToMany(mappedBy = "activityType")
	private List<MyActivity> myActivitiesList;

	public Long getActid() {
		return actid;
	}

	public void setActid(Long actid) {
		this.actid = actid;
	}

	public String getActivitytype() {
		return activitytype;
	}

	public void setActivitytype(String activitytype) {
		this.activitytype = activitytype;
	}

	public List<MyActivity> getMyActivitiesList() {
		return myActivitiesList;
	}

	public void setMyActivitiesList(List<MyActivity> myActivitiesList) {
		this.myActivitiesList = myActivitiesList;
	}

}