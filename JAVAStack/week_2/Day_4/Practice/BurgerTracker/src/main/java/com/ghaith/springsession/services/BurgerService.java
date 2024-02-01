package com.ghaith.springsession.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghaith.springsession.models.Burger;
import com.ghaith.springsession.repositories.BurgerRepository;

@Service
public class BurgerService {
	
	// C R U D
	@Autowired
	private BurgerRepository burgerRepo;
	
	// Read ALL
	public List<Burger> allBurgers(){
		
		return burgerRepo.findAll();
		
	}
	
	// Create
	
	public Burger createBurger(Burger b) {
		
		return burgerRepo.save(b);
	}
	
	// Read One
	
	public Burger findBurgerById(Long id) {
		Optional<Burger>maybeBurger = burgerRepo.findById(id);
		if(maybeBurger.isPresent()) {
			return maybeBurger.get();
		}else {
			return null;
		}
	}
		
		// Update 
		public Burger updateBurger (Burger b) {
			return burgerRepo.save(b);
			
		
		}
		
		// Delete 
		public void deleteBurger(Long id) {
			
			 burgerRepo.deleteById(id);
		}
		
		
		
	
	
	
	

}
