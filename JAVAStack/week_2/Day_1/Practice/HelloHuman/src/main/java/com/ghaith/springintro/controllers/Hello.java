package com.ghaith.springintro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Hello {
	@GetMapping("/")
	public String HelloName(){
		return "hello Human";
	}
	
	@GetMapping("/search")
	public String HelloGhaith(@RequestParam(value = "query") String searchQuery) {
	
		return "Hello" + searchQuery;
	}
	
	
	
}
