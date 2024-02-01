package com.ghaith.springsession.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ghaith.springsession.models.Book;
import com.ghaith.springsession.repositories.BookRepository;

@Service
public class BookServices {
	
	 // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookServices(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
}
