package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Modal.User;
import com.example.ServiceI.UserService;

@RestController
public class UserControllar {
	@Autowired
	private UserService userService;
	
	@PostMapping("/Save")
	public User saveUser(@RequestBody User user) {
		User user1=userService.saveUser(user);
		return user1;
		
		
	}
	
	
	

}
