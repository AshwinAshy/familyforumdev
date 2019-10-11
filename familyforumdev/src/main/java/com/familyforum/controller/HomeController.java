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

	@GetMapping("/login")
	public ModelAndView temporaryLoginMethod(@RequestParam("username") String username,
			@RequestParam("password") String password, ModelAndView modelAndView) {
		
		
		
		Map<String, String> userMap = new HashMap<>();
		List<User> userList = userService.getUserList();
		for (User user : userList) {
			userMap.put(user.getUsername(), user.getPassword());
		}
		System.out.println(userMap + "------username: " + username + " ........password : " + password);
		boolean login = false;
		
		for(Map.Entry<String, String> entry : userMap.entrySet()){
			if(	entry.getKey().equals(username) && entry.getValue().equals(password) ){
				login = true;
				break;
			}
		}
		if(login){
			List<ActivityType> listActivityType = activitiyTypeService.listAllActivityType();
			modelAndView.addObject("username",username);
			modelAndView.addObject("listActivityType", listActivityType);
			modelAndView.setViewName("welcomepage");
		}else{
			modelAndView.setViewName("successpage");
			modelAndView.addObject("msg", "Invalid Username or password ......");
		}
		
		
		return modelAndView;
	}

	@GetMapping("/test")
	public ModelAndView testControllerFlow(ModelAndView model) {
		model.setViewName("test");
		model.addObject("msg", "Test Successful........");
		return model;
	}

}
