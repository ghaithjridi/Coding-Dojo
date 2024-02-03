package com.ghaith.springsession.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghaith.springsession.Repository.NinjaRepository;
import com.ghaith.springsession.models.Ninja;

@Service
public class NinjaService {
	// Business LOGIC
			// C R U D
			
			// DI
			@Autowired
			private NinjaRepository ninjaRepo;
			
			// Read all
			
			public List<Ninja> allNinjas(){
				return ninjaRepo.findAll();
				
			}
			
			// CREATE
			public Ninja createNinja(Ninja n) {
				return ninjaRepo.save(n);
			}
			
			// READ ONE
			public Ninja findNinjaById(Long id) {
				Optional<Ninja> maybeNin = ninjaRepo.findById(id);
				if(maybeNin.isPresent()) {
					return maybeNin.get();
				}else {
					return null;
				}
			}
			
			// UPDATE
			public Ninja updateNinja(Ninja n) {
				return ninjaRepo.save(n);
			}
			
			// DELETE
			public void deleteNinja(Long id) {
				ninjaRepo.deleteById(id);
			}
	
	

}
