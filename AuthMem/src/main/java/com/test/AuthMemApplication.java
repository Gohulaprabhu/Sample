package com.test;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@EnableResourceServer
@SpringBootApplication
@EnableAuthorizationServer
public class AuthMemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthMemApplication.class, args);
	}

	@RequestMapping("/user")
	public Principal getLoginInfo(Principal p) {
	     
	      return  p;
	   	}
}
