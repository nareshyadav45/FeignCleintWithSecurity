package com.security.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerBasic {

	@GetMapping("/hi")
	public String hi() {
		return "Hi";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
}
