package com.ghaith.springsession.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ghaith.springsession.models.Burger;
import com.ghaith.springsession.services.BurgerService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/burgers")
public class BurgerController {

	@Autowired
	private BurgerService burgerserv;

	// display allBurger
	@GetMapping("")
	public String home(@ModelAttribute("burger") Burger burger, Model model) {
		List<Burger> allBurgers = burgerserv.allBurgers();
		model.addAttribute("allBurgers", allBurgers);
		return "home.jsp";
	}

	// Process Burger

	@PostMapping("/processBurger")
	public String createBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<Burger> allBurgers = burgerserv.allBurgers();
			model.addAttribute("allBurgers", allBurgers);
			return "home.jsp";
		} else {
			Burger newBurger = burgerserv.createBurger(burger);
			return "redirect:/burgers";
		}
	}
	
	@DeleteMapping("/{id}")
	public String deleteBurger(@PathVariable("id") Long id) {
		
		burgerserv.deleteBurger(id);
		
		return "redirect:/burgers";
	}
	
	// Display Edit Form
	
		@GetMapping("/edit/{id}")
		public String getMethodName(Model model, @PathVariable("id") Long id) {
			// find the burger by the id
			Burger selectBurger = burgerserv.findBurgerById(id);
			model.addAttribute("burger",selectBurger);
			return "edit.jsp";
		}
		
		@PutMapping("/{id}")
		public String editBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result) {
			
			if(result.hasErrors()) {
				return "edit.jsp";
			}else {
				// if there are no errors save the updated book to DB
				burgerserv.updateBurger(burger);
			
				return "redirect:/burgers";
			}
		}

}
