package com.jeremy.stringProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "Hello client.  How are you doing?";
	}
	
	@RequestMapping(value="/random", method=RequestMethod.GET)
	public String randomPlace() {
		return "Hello random.  You are so random";
	}

}
