package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Customer;
import com.demo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer findCustomer() {
		Customer customer = new Customer();
		customer.setName("Murli");
		customerRepository.save(customer);
		return customerRepository.findOne(1L);
	}

}