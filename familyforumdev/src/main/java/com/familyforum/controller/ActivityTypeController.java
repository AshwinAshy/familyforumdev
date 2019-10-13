package com.familyforum.controller;

import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.familyforum.model.ActivityType;
import com.familyforum.service.ActivityTypeServiceIntf;

@Controller
public class ActivityTypeController {

	@Autowired
	ActivityTypeServiceIntf activityTypeService;
	
	public ActivityTypeController() {}
	
	
	@PostMapping("addNewActivityType")
	//public ModelAndView addActivityType(@RequestParam("activityType") String activityType, ModelAndView modelAndView){
	public ModelAndView addActivityType(@Valid @ModelAttribute("activityType")ActivityType activityType,BindingResult br, ModelAndView modelAndView){

		if(br.hasErrors()){
			List<ActivityType> listActivityType = activityTypeService.listAllActivityType();
			modelAndView.addObject("listActivityType", listActivityType);
			modelAndView.setViewName("myactivities");
			
			return modelAndView;
		}
		
		ActivityType activityTypeObj = new ActivityType();
		activityTypeObj.setActivitytype(activityType.getActivitytype());
		
		activityTypeService.addActivityType(activityTypeObj);
		
		List<ActivityType> listActivityType = activityTypeService.listAllActivityType();
		modelAndView.addObject("listActivityType", listActivityType);
		modelAndView.addObject("activitymsg", "Activity Type Added Successfully");
		modelAndView.setViewName("myactivities");
		
		return modelAndView;		
	}

}