package com.ghaith.springsession.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ghaith.springsession.models.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
	// Find ALL BOOKS
		List<Book> findAll();

}
