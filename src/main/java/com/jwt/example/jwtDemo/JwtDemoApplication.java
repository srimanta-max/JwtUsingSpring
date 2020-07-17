package com.jwt.example.jwtDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication( scanBasePackages = {"com.jwt.example.jwtDemo.config","com.jwt.example.jwtDemo.service","com.jwt.example.jwtDemo.model","com.jwt.example.jwtDemo.controller"})
public class JwtDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtDemoApplication.class, args);
	}

}
