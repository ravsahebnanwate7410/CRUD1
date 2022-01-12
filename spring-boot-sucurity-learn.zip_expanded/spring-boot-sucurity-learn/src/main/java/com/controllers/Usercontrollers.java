package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.models.User;
import com.services.Userservices;

@RestController
@RequestMapping("/users")
public class Usercontrollers {

	// @GetMapping("/test")
	// public String test() {
	// return "Hay I am test method....";
	@Autowired
	private Userservices userServices;

	//all user
	@GetMapping("/")
	public List<User> getAllUser()
	{
          return this.userServices.getAllUsers();
          
	}
	
	//single user
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userServices.getUser(username);
	}
	public User add (@RequestBody User user) {
		return this.userServices.addUser(user);
	}
}
