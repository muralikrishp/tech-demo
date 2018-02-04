package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Customer;
import com.demo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/hello")
	public String hello(){
		return "Hello Murali";
	}
	
	@GetMapping("/get-customer")
	public Customer getCustomer(){
		return customerService.findCustomer();	
	}

}
