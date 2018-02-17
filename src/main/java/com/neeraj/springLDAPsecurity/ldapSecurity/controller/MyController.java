package com.neeraj.springLDAPsecurity.ldapSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/secured")
	public String sayHello() {
		return "you have passed the authentication";
	}

}
