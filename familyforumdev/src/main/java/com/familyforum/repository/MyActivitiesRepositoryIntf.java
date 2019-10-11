package com.familyforum.repository;

import java.util.List;

import com.familyforum.model.MyActivity;

public interface MyActivitiesRepositoryIntf {

	void addMyActivity(MyActivity myActivity);
	List<MyActivity> listAllMyActivity();
}
