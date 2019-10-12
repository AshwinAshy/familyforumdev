package com.familyforum.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.familyforum.model.ActivityType;
import com.familyforum.model.MyActivity;
import com.familyforum.model.User;
import com.familyforum.service.ActivityTypeServiceIntf;
import com.familyforum.service.MyActivitiesServiceIntf;
import com.familyforum.service.UserServiceIntf;

@Controller
public class MyActivityController {

	@Autowired
	MyActivitiesServiceIntf myActivitiesService;
	
	@Autowired
	ActivityTypeServiceIntf activityTypeService;
	
	@Autowired
	UserServiceIntf userService;
	
	public MyActivityController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("myactivities")
	public ModelAndView showMyActivitiesPage(ModelAndView modelAndView){
		List<ActivityType> listActivityType = activityTypeService.listAllActivityType();
		modelAndView.addObject("username","dummyusername");
		modelAndView.addObject("listActivityType", listActivityType);
		modelAndView.setViewName("myactivities");
		return modelAndView;
	}
	
	@GetMapping("addMyActivity")
	public ModelAndView addMyActivity(MyActivity myActivity, ModelAndView modelAndView, HttpServletRequest request){
		Long activityID = 0L;
		if(request.getParameter("actid")!=null)
			activityID = Long.parseLong(request.getParameter("actid"));
		
		ActivityType activityType = activityTypeService.getActivityTypeById(activityID);
		User user = userService.getUserByID(52L);//Change this code after implementing real login.
		myActivity.setUser(user);
		myActivity.setActivityType(activityType);
		myActivitiesService.addMyActivity(myActivity);
		
		List<ActivityType> listActivityType = activityTypeService.listAllActivityType();
		modelAndView.addObject("username","dummyusername");
		modelAndView.addObject("listActivityType", listActivityType);
		modelAndView.setViewName("myactivities");
		return modelAndView;
	}

}
