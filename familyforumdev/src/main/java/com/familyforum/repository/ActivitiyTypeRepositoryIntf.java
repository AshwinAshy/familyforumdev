package com.familyforum.repository;

import java.util.List;

import com.familyforum.model.ActivityType;

public interface ActivitiyTypeRepositoryIntf {
	
	void addActivityType(ActivityType activities);
	
	List<ActivityType> listAllActivityTypes();
	
	ActivityType getActivityTypeById(Long id);

}
