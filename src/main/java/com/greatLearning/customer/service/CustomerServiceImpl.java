package com.greatLearning.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.greatLearning.customer.entity.Customer;
import com.greatLearning.customer.repository.CustomerRepository;

public class CustomerServiceImpl {
	@Autowired
	CustomerRepository customerRepository;
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}

}
