package com.security.client.feigncleint;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name="security-service",url="http://localhost:8080")
public interface SecuredFeignCleint {
	
	@GetMapping("/hello")
	public String hello();

	//public String hello(@RequestHeader("Authorization") String authorizationHeader);

}
