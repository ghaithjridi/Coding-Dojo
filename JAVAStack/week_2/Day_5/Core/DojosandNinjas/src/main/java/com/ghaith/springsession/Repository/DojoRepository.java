package com.ghaith.springsession.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ghaith.springsession.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo , Long> {
	// Find ALL Dojos
	
		List<Dojo> findAll();
	

}
