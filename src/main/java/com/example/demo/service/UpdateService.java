package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UpdateService {

	@Autowired
	private UserRepository userRepository;

	// Update User
	public String updateProfile(User user) {
		System.out.println("Inside Update User method!!");
		try {
			if (user != null) {
				User ud = userRepository.findByUserId(user.getUserId());
				if (ud != null) {
					userRepository.save(user);
					return "Profile of "+user.getFirstName()+" Updated";
					//return user.getFirstName();
				} else {
					return "Invalid User";
				}

			} else {
				return "User Does not exist!!";
			}

		} catch (Exception e) {
			e.printStackTrace();
			return "Operation Failed";
		}
		

	}
}
