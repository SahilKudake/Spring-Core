package com.springproject.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springproject.demo.model.UserDetails;

@Component
public class UserServiceImpl implements UserService {

	private static List<UserDetails> userDetails = new ArrayList<UserDetails>();

	static {
		UserDetails admin = new UserDetails(101, "Sahil", "sahil@gmail.com");
		UserDetails test = new UserDetails(105, "Nikunj", "nikunj@gmail.com");

		userDetails.add(admin);
		userDetails.add(test);
	}

	public List<UserDetails> getAllUsers() {

		return userDetails;
	}

	public UserDetails getUserById(int id) {
		for (UserDetails user : userDetails) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

}
