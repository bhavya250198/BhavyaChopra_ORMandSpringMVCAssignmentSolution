package com.greatLearning.customer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping("/home")
	public String home() {
		System.out.println("return Home");
		return "home";
	}
}
