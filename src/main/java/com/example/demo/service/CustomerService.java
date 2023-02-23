package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customers;
import com.example.demo.repository.CustomersRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomersRepository customerRepository;

	public String saveCustomer(Customers customers) {

		System.out.println("Inside Customer service save method!!");
		try {
			if (customers != null) {

				customerRepository.save(customers);
				return "Customer Details Saved";
			} else {
				return "Empty customer detail provided!!";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "Invalid Operation!!";
		}
	}
	public List<Customers> findAllCustomer(Customers customer) {
		System.out.println("Inside Find all customers");
		try {
			return customerRepository.findAll();
		}catch(Exception e) {
			return null;
		}
	}

}
