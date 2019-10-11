package com.familyforum.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.familyforum.model.ActivityType;

@Service
public class ActivityTypeRepository implements ActivitiyTypeRepositoryIntf {

	@Autowired
	EntityManager entityManager;

	public ActivityTypeRepository() {
	}

	@Override
	public void addActivityType(ActivityType activityType) {

		Session session = entityManager.unwrap(Session.class);
		session.save(activityType);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ActivityType> listAllActivityTypes() {
		Session session = entityManager.unwrap(Session.class);
		List<ActivityType> listActivityTypes = session.createQuery("from ActivityType").list();
		return listActivityTypes;
	}

	@Override
	public ActivityType getActivityTypeById(Long id) {
		Session session = entityManager.unwrap(Session.class);
		ActivityType activityType = session.get(ActivityType.class, id);
		return activityType;
	}

}
