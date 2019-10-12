package com.familyforum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.familyforum.model.User;
import com.familyforum.service.ActivityTypeServiceIntf;
import com.familyforum.service.UserService;

@Controller
public class SignUpController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	ActivityTypeServiceIntf activitiyTypeService;
	
	@GetMapping("/signupform")
	public ModelAndView showSignUpForm(ModelAndView modelAndView) {
		modelAndView.setViewName("signupform");
		return modelAndView;
	}

	@PostMapping("/signupformsubmit")
	public ModelAndView signUpSubmit(@ModelAttribute("user") User user, ModelAndView modelAndView) {
		userService.saveUser(user);
		System.out.println("User---------------");
		System.out.println(user.toString());
		modelAndView.addObject("msg", "Sign up successful");
		modelAndView.setViewName("successpage");
		return modelAndView;
	}

	public SignUpController() {}

}
