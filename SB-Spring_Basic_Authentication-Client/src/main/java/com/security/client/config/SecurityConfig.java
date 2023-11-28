package com.security.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.auth.BasicAuthRequestInterceptor;

@Configuration
public class SecurityConfig {
	 @Bean
	    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
	        return new BasicAuthRequestInterceptor("naresh", "naresh@45");
	    }
}
