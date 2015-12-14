package com.sentinel.engine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorld {
	
	@RequestMapping(value = "/hello.json", method = RequestMethod.POST)
	public String getHelloWorld() {
 
		String message = "{\"id\":2,\"content\":\"Hello, User!\"}";
		return message;
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "welcome";
	}
}
