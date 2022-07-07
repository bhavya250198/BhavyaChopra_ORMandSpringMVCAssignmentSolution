package com.greatLearning.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatLearning.customer.entity.Customer;
import com.greatLearning.customer.repository.CustomerRepository;

@Service
public class CustomerService{
	@Autowired
	CustomerRepository customerRepository;
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}
	public Customer getCustomerById( int id) {
		return customerRepository.findById(id).get();
	}
	
	public void save(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void deleteById(int id) {
		customerRepository.deleteById(id);
	}

}
