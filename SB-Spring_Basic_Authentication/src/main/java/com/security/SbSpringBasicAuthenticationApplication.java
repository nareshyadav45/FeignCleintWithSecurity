package com.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SbSpringBasicAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbSpringBasicAuthenticationApplication.class, args);
	}

}
