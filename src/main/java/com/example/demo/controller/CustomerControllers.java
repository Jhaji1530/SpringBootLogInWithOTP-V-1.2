package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customers;
import com.example.demo.service.CustomerService;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("/customer")
public class CustomerControllers {
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/save")
	public String saveCustomer(@RequestBody Customers customers) {
		return customerService.saveCustomer(customers);
	}
}
