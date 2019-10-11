package com.familyforum.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.familyforum.model.MyActivity;

@Component
public class MyActivitiesRepository implements MyActivitiesRepositoryIntf {

	@Autowired
	EntityManager entityManager;
	
	public MyActivitiesRepository() {}

	@Override
	public void addMyActivity(MyActivity myActivity) {
		Session session = entityManager.unwrap(Session.class);
		session.save(myActivity);
	}

	@Override
	public List<MyActivity> listAllMyActivity() {
		// TODO Auto-generated method stub
		return null;
	}

}
