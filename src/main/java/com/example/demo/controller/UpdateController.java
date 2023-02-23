package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UpdateService;

@CrossOrigin
@RestController
@RequestMapping("/update")
public class UpdateController {
	
	@Autowired
	private UpdateService updateService;
	
	@PutMapping("/profile")
	public String updateProfile(@RequestBody User user){
		return updateService.updateProfile(user);
	}

}
