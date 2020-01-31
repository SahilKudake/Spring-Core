package com.springproject.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.demo.model.UserDetails;
import com.springproject.demo.service.UserServiceImpl;

@RestController
public class UserController {

	private UserServiceImpl userService;
	
	@GetMapping("/user")
	public List<UserDetails> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/user{userId}")
	public UserDetails getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}
}
