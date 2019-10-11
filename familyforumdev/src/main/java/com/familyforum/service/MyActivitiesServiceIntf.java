package com.familyforum.service;

import java.util.List;

import com.familyforum.model.MyActivity;

public interface MyActivitiesServiceIntf {

	void addMyActivity(MyActivity myActivity);
	List<MyActivity> listAllMyActivity();
}
