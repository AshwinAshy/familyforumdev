package com.familyforum.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.familyforum.model.User;
import com.familyforum.service.ActivityTypeServiceIntf;
import com.familyforum.service.UserService;

@Controller
public class UpdateProfileController {

	@Autowired
	UserService userService;
	
	@Autowired
	ActivityTypeServiceIntf activitiyTypeService;
	
	public UpdateProfileController() {}

	@GetMapping("updateprofile")
	public ModelAndView showUserProfilePage(ModelAndView modelAndView){
		modelAndView.setViewName("updateprofile");
		return modelAndView;
	}
	
	@PostMapping("/updateprofilesubmit")
	public ModelAndView signUpSubmit(@Valid @ModelAttribute("user") User user,BindingResult result, ModelAndView modelAndView,HttpServletRequest request) {
		
		Principal principal = request.getUserPrincipal();
		
		if(result.hasErrors()){
			modelAndView.setViewName("updateprofile");
			return modelAndView;
		}
		
		user.setUsername(principal.getName());
		userService.saveUser(user);
		System.out.println("Update profile submit is called ---------------");
		System.out.println(user.toString());
		modelAndView.addObject("msg", "Profile updated successfully....");
		modelAndView.setViewName("updateprofile");
		return modelAndView;
	}
}
