package com.jwt.example.jwtDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping({"/hello"})
	public String firstPage() {
		return "Hellow world";
	}
	

	

}
