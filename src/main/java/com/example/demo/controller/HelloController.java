package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
	
	@GetMapping("/public")
	public String publicEndPoing() {
		return "This is public endpoint";
	}
	
	@GetMapping("/user")
	public String userEndPoing() {
		return "This is user endpoint";
	}
	
	@GetMapping("/admin")
	public String adminEndPoing() {
		return "This is admin endpoint";
	}

}
