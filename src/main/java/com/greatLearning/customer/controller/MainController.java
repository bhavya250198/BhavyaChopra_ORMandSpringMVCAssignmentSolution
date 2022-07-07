package com.greatLearning.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class MainController {
	@RequestMapping("/home")
	public String helloWorld() {
		return "home";
	}

}
