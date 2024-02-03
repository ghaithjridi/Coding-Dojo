package com.ghaith.springsession.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ghaith.springsession.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	
	// READ ALL
		List<Ninja> findAll();
	
	

}
