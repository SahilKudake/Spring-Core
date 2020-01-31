package com.springproject.demo.service;

import java.util.List;

import com.springproject.demo.model.UserDetails;

public interface UserService {

	public List<UserDetails> getAllUsers();
	
	public UserDetails getUserById(int id);
}
