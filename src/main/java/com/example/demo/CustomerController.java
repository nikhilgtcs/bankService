package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;

@RestController
public class CustomerController {
//	Customer Name 
	//	Mandatory field
	//	Should not be blank
	//	Maximum of 25 characters
	//	Only alphabets and spaces
	//	Only spaces not allowed
//	Gender
	//	Mandatory field
	//	Should be either male or female
	
	@PostMapping("/customer")
	void createCust(@RequestBody Customer cust) {
		
	}
}
