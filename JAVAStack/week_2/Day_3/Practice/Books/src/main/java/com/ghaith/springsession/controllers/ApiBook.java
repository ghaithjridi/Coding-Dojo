package com.ghaith.springsession.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ghaith.springsession.models.Book;
import com.ghaith.springsession.services.BookServices;

@RestController
@RequestMapping("/api/books")
public class ApiBook {

	private final BookServices bookService;

	public ApiBook(BookServices bookService) {
		this.bookService = bookService;
	}

	@GetMapping("")
	public List<Book> getAllBook(){
		List<Book> bookList= bookService.allBooks();
		
		return bookList;
		}

	@PostMapping("")
		public Book create( @RequestParam(value="title")String title,@RequestParam(value="description")String description,@RequestParam(value="Language")String Language,@RequestParam(value="numOfPages") Integer numOfPages) {
			
			
			Book newBook = new Book (title,description,Language,numOfPages);
			
			return bookService.createBook(newBook);
		}
	
	@GetMapping("/{id}")
	public Book findOneBookById(@PathVariable("id") Long id) {
		return bookService.findBook(id);
		 
	}
		
	

}
