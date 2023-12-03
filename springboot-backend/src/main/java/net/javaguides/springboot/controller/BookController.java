package net.javaguides.springboot.controller;

import net.javaguides.springboot.model.Book;
import net.javaguides.springboot.repository.BookRepository;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")


public class BookController {
	
	@Autowired
	private BookRepository BookRepository;
	
	// get all books
	@GetMapping("/books")
	public List<Book> getAllBook() {
		return BookRepository.findAll();

	}

}
