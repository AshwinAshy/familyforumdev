package com.familyforum.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.familyforum.service.UserService;
//Checking the commit
@Controller
public class HomeController {

	@Autowired
	UserService userService;
	
	@Autowired
	ActivityTypeServiceIntf activitiyTypeService;

	@GetMapping("/")
	public ModelAndView handleHomePage(ModelAndView modelAndView) {
		modelAndView.setViewName("homepage");
		return modelAndView;
	}
	
	@GetMapping("/test")
	public ModelAndView testControllerFlow(ModelAndView model) {
		model.setViewName("test");
		model.addObject("msg", "Test Successful........");
		return model;
	}

}
