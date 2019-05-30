package com.in28minutes.rest.webservices.restfulwebservices.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.AuthenticationBean;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController {	
	
	@GetMapping(path="/basicauth")
	public AuthenticationBean authBean() {
		return new AuthenticationBean("You are authenticated");
		// throw new RuntimeException("Some error happened. Contact support ***");
	}	

}
