package com.ghaith.springsession.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ghaith.springsession.models.Travel;

public interface TravelRepository extends CrudRepository<Travel, Long> {
	
	
	// Find ALL Travels
		List<Travel> findAll();
}
