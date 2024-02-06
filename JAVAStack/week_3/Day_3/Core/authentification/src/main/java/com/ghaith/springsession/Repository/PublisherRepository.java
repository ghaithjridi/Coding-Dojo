package com.ghaith.springsession.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ghaith.springsession.models.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
	
	// READ ALL
		List<Publisher> findAll();

}
