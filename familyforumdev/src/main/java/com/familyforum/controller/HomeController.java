package com.familyforum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.familyforum.service.ActivityTypeServiceIntf;
import com.familyforum.service.UserService;

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
