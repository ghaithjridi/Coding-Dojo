package com.ghaith.springsession.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ghaith.springsession.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	// for logging user
	  Optional<User> findByEmail(String email);

}
