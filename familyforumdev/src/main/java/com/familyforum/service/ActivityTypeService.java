package com.familyforum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.familyforum.model.ActivityType;
import com.familyforum.repository.ActivitiyTypeRepositoryIntf;

@Component
@Transactional
public class ActivityTypeService implements ActivityTypeServiceIntf {

	@Autowired
	ActivitiyTypeRepositoryIntf activityTypeRepository;
	
	@Override
	public void addActivityType(ActivityType activityType) {
		activityTypeRepository.addActivityType(activityType);
	}

	@Override
	public List<ActivityType> listAllActivityType() {
		List<ActivityType> listActivityTypes = activityTypeRepository.listAllActivityTypes();
		return listActivityTypes;
	}

	@Override
	public ActivityType getActivityTypeById(Long id) {
		ActivityType activityType = activityTypeRepository.getActivityTypeById(id);
		return activityType;
	}
}
