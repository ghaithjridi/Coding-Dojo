package com.ghaith.springsession.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ghaith.springsession.models.Book;
import com.ghaith.springsession.services.BookServices;

@Controller
@RequestMapping("/books")
public class ViewController {
	private final BookServices bookService;

	public ViewController(BookServices bookService) {
		this.bookService = bookService;
	}

	@GetMapping("")
	public String getAllBook( Model model){
	
		List<Book> allBooks=bookService.allBooks();
		model.addAttribute("allBooks",allBooks);
		
		return "home.jsp";
		}
	
	@GetMapping("/create")
	public String displayForm( ){
	
		
		
		return "form.jsp";
		}
	

	@PostMapping("/processBook")
		public String create( @RequestParam(value="title")String title,@RequestParam(value="description")String description,@RequestParam(value="Language")String Language,@RequestParam(value="numOfPages") Integer numOfPages) {
			
			
			Book newBook = new Book (title,description,Language,numOfPages);
			bookService.createBook(newBook);
			
			return"redirect:/books";
		}
	
	@GetMapping("/{id}")
	public String findOneBookById(@PathVariable("id") Long id,Model model) {
		Book selectedBook = bookService.findBook(id);
		model.addAttribute("book", selectedBook);
		return "showOne.jsp";
		 
	}

}
