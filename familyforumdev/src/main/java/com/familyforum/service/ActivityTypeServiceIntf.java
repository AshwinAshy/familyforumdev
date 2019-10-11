package com.familyforum.service;

import java.util.List;

import com.familyforum.model.ActivityType;

public interface ActivityTypeServiceIntf {
	
	void addActivityType(ActivityType activityType);
	
	List<ActivityType> listAllActivityType();
	
	ActivityType getActivityTypeById(Long id);
}
