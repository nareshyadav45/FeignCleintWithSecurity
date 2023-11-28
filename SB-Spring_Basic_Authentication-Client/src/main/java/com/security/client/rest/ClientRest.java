package com.security.client.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.client.feigncleint.SecuredFeignCleint;

@RestController
public class ClientRest {

	@Autowired
	private SecuredFeignCleint FeignClient;
	
//	@Autowired
//	public ClientRest(SecuredFeignCleint FeignClient) {
//		this.FeignClient=FeignClient;
//		// TODO Auto-generated constructor stub
//	}
	
	@GetMapping("/testHello")
	public String test() {
		String hello = this.FeignClient.hello();
		System.out.println("successfully Implemeted feign client");
		return hello;
	}
	
}
