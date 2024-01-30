package com.ghaith.springsession.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class SessionController {
	@GetMapping("/")
	public String index(Model model, HttpSession session) {
		String name = "ghaith";
		int count = (int) session.getAttribute("count");
		session.setAttribute("count", count+1);
		
		model.addAttribute("sessionName", name);
		return "index.jsp";
		
	}
	
	@GetMapping("/counter")
	public String dash(Model model,HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			model.addAttribute("count",session.getAttribute("count"));
		}else {
			model.addAttribute("count",session.getAttribute("count"));
		}
		
		
		
		
		
		return"other.jsp";
		
	}

}
