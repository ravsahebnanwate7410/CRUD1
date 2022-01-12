package com.services;


import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.models.User;

@Service
public class Userservices {

	List<User> List = new ArrayList<>();

	public Userservices() {
	  List.add(new User ("abc", "ABC","rnanwate.gamil@com"));
	  List.add(new User ("abc123", "ABC123","rnanwate123@gamil.com"));

	}
	public List<User>getAllUsers(){
		return this.List;
		
	}
	public User getUser(String username)
	{
		return this.List.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
	}
	
	public User addUser(User user)
	{
		this.List.add(user);
		 return user;
	}

}
