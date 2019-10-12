package com.familyforum.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.familyforum.model.ActivityType;
import com.familyforum.model.User;
import com.familyforum.service.ActivityTypeServiceIntf;
import com.familyforum.service.UserService;

@Controller
public class LoginController {


	public LoginController() {}

	@Autowired
	UserService userService;

	@Autowired
	ActivityTypeServiceIntf activitiyTypeService;
	
	@GetMapping("loginpage")
	public String showloginpage(){
		return "loginpage";
	}
	
	@GetMapping("/login")
	public ModelAndView temporaryLoginMethod(ModelAndView modelAndView) {
			List<ActivityType> listActivityType = activitiyTypeService.listAllActivityType();
			modelAndView.addObject("listActivityType", listActivityType);
			modelAndView.setViewName("myactivities");
			modelAndView.setViewName("successpage");
			modelAndView.addObject("msg", "Invalid Username or password ......");		
		
		return modelAndView;
	}
}
