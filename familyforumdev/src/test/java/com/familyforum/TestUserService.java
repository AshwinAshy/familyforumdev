//package com.familyforum;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.transaction.Transactional;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.Rollback;
//
//import com.familyforum.builder.UserBuilder;
//import com.familyforum.model.User;
//import com.familyforum.repository.UserRepository;
//import com.familyforum.service.UserService;
//
//@RunWith(MockitoJUnitRunner.class)
//@SpringBootTest
//public class TestUserService {
//
//	@InjectMocks
//	UserService userService;
//	
//	@Mock
//	UserRepository userRepository;
//	
//	@Test
//	public void saveUserTest(){
//		User user = new UserBuilder().setFirstname("firstname").setLastname("lastname").setEmailid("emailid")
//				.setPhonenumber("12345").setUsername("username").setPassword("sdfsdfs").build();			
//		userService.saveUser(user);
//		userService.saveUser(user);
//		
//		verify(userRepository, times(2)).saveUser(user);
//	}
//
//	
//	@Test
//	public void getUserListTest(){
//		List<User> userList = new ArrayList<>();
//
//		User user = new UserBuilder().setFirstname("firstname1").setLastname("lastname1").setEmailid("emailid1")
//				.setPhonenumber("12345").setUsername("username1").setPassword("password1").build();
//		userList.add(user);
//		
//		user = new UserBuilder().setFirstname("firstname2").setLastname("lastname2").setEmailid("emailid2")
//				.setPhonenumber("12342").setUsername("username2").setPassword("password2").build();
//		userList.add(user);
//
//		user = new UserBuilder().setFirstname("firstname3").setLastname("lastname3").setEmailid("emailid3")
//				.setPhonenumber("123453").setUsername("username3").setPassword("password3").build();
//		userList.add(user);
//		
//		when(userService.getUserList()).thenReturn(userList);
//		
//		userList = userService.getUserList();
//		
//		assertEquals(3, userList.size());
//		verify(userRepository, times(1)).getUserList();
//		
//	}
//	
//}
