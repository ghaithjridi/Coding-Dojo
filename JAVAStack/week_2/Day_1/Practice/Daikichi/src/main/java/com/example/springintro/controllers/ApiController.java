package com.example.springintro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class ApiController {
	@GetMapping ("/")
	 public String home() {
		return "welcome !";
	}
	
	@GetMapping ("/today")
	 public String today() {
		return "today you will find in all your endeavors !";
	}
	
	@GetMapping ("/tomorrow")
	 public String tomorrow() {
		return "tomorow,an opportunity will arise,so ne sure to be open to new ideas!";
	}

}
