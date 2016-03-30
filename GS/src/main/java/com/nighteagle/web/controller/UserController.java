package com.nighteagle.web.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.nighteagle.web.model.User;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public User login(@RequestParam("username") String username, @RequestParam("password") String password) {
		User user = new User();
		if(username.equals("admin") && password.equals("admin")){
			user.setAuthenticated("true");
			user.setId("001");
			user.setFirstname("John");
			user.setLastname("Doe");
		} else {
			user.setAuthenticated("false");
		}
		return user;
	}
}
