package com.greatLearning.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.greatLearning.customer.entity.Customer;
import com.greatLearning.customer.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	@RequestMapping("/list")
	public  String getCustomers(Model model){
		List<Customer> customer = customerService.getAllCustomers();
		model.addAttribute("details",customer);
		return "customer-list" ;
	}
	
	@RequestMapping("/addCustomer")
	public String addCustomerForm(Model model) {
		Customer customer = new Customer();
		model.addAttribute("Customer",customer);
		return "customer-form";
	}
	@RequestMapping("/updateCustomer")
	public String addCustomerForm(Model model,@RequestParam("customerId" ) int id) {
		Customer customer = customerService.getCustomerById(id);
		model.addAttribute("Customer",customer);
		return "customer-form";
	}
	
	@PostMapping("/save")
	public String saveCustomer(@RequestParam("id")int id, @RequestParam("firstName")String firstName,@RequestParam("lastName")String lastName,@RequestParam("emailAddress")String emailAddress) {
		Customer customer = null;
		if(id !=0) {
			customer = customerService.getCustomerById(id);
			customer.setFirstName(firstName);
			customer.setLastName(lastName);
			customer.setEmailAddress(emailAddress);
		}
		
		
		else 
	     customer = new Customer(firstName,lastName,emailAddress);
		
		customerService.save(customer);
		return "redirect:/customers/list";
	}
	
	@RequestMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("id")int id) {
		
		customerService.deleteById(id);
		return "redirect:/customers/list";
	}
	
	
}
