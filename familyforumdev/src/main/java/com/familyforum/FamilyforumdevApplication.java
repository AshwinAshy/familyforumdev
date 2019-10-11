package com.familyforum;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.familyforum.model.ActivityType;
import com.familyforum.model.MyActivity;
import com.familyforum.model.User;
import com.familyforum.service.ActivityTypeServiceIntf;
import com.familyforum.service.MyActivitiesServiceIntf;
import com.familyforum.service.UserServiceIntf;

@SpringBootApplication
public class FamilyforumdevApplication implements CommandLineRunner {

	@Autowired
	UserServiceIntf userService;
	
	@Autowired
	ActivityTypeServiceIntf activityTypeService;
	
	@Autowired
	MyActivitiesServiceIntf myActivitiesService;
	
	public static void main(String[] args) {
		SpringApplication.run(FamilyforumdevApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		//Testing save
//		User user = new UserBuilder().setFirstname("1").setLastname("1").setEmailid("1")
//				.setPhonenumber("1").setUsername("1").setPassword("1").build();
//		userService.saveUser(user);
		
		//Testing Update
//		User user = userService.getUserByID(1L);
//		System.out.println("User Before update ----------------------");
//		System.out.println(user.toString());
//		
//		user.setFirstname("2");user.setLastname("2");
//		user.setEmailid("2");user.setPhonenumber("2");
//		user.setUsername("2");user.setPassword("2");
//		
//		userService.updateUser(user);
//		System.out.println("User After update ----------------------");
//		System.out.println(user.toString());
		
//		Map<String, String> userMap = new HashMap<>();
//		List<User> userList = userService.getUserList();
//		for (User user : userList) {
//			userMap.put(user.getUsername(), user.getPassword());
//		}
//		System.out.println("-----------Printing the users list -----------------------");
//		System.out.println(userMap.toString());
		
		//Testing ActivityType
//		ActivityType activityType = new ActivityType();
//		activityType.setActivitytype("Yoga");
//		activityTypeService.addActivityType(activityType);
//		activityType.setActivitytype("Spritual");
//		activityTypeService.addActivityType(activityType);
//		activityType.setActivitytype("Cooking");
//		activityTypeService.addActivityType(activityType);
//		activityType.setActivitytype("Jogging");
//		activityTypeService.addActivityType(activityType);
//		activityType.setActivitytype("Reading");
//		activityTypeService.addActivityType(activityType);
//		
//		
//		List<ActivityType> listActivityTypes = activityTypeService.listAllActivityType();
//		listActivityTypes.stream().forEach(System.out::println);
		
		//Testing MyActivities
//		User user = userService.getUserByID(40L);
//		ActivityType activityType = activityTypeService.getActivityTypeById(47L);
//		MyActivity myActivity = new MyActivity();
//		myActivity.setUser(user);
//		myActivity.setActivityType(activityType);
//		myActivitiesService.addMyActivity(myActivity);
		
		//Testing Cascading
//		User user = userService.getUserByID(40L);
//		userService.deleteUserByID(40L);
		

		
	}

}
