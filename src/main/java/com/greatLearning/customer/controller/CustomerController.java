package com.greatLearning.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatLearning.customer.entity.Customer;
import com.greatLearning.customer.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	CustomerService customerService;
	@RequestMapping("/list")
	public List<Customer> getCustomers(){
		return customerService.getAllCustomers();
	}

	
}
