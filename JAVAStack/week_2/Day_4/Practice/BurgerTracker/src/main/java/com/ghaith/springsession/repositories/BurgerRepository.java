package com.ghaith.springsession.repositories;




import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ghaith.springsession.models.Burger;

public interface BurgerRepository extends CrudRepository<Burger, Long> {
	
	// Find ALL BOOKS
		List<Burger> findAll();

}
