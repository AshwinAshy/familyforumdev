package com.familyforum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.familyforum.model.MyActivity;
import com.familyforum.repository.MyActivitiesRepositoryIntf;

@Component
@Transactional
public class MyActivitiesService implements MyActivitiesServiceIntf {

	@Autowired
	MyActivitiesRepositoryIntf myActivitiesRepository;
	
	public MyActivitiesService() {}

	@Override
	public void addMyActivity(MyActivity myActivity) {
		myActivitiesRepository.addMyActivity(myActivity);
	}

	@Override
	public List<MyActivity> listAllMyActivity() {
		// TODO Auto-generated method stub
		return null;
	}

}
