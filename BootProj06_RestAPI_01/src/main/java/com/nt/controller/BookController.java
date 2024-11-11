package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Book;
import com.nt.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public List<Book> getBooks() {
		return bookService.getAllBook();
	}

	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable int id) {
		return bookService.getBookById(id);
	}

	@PostMapping("/books")
	public Book insertBook(@RequestBody Book book) {
		Book b = bookService.addBook(book);
		return b;
	}
	
	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable int id)
	{
		bookService.deleteBook(id);
	}
	
	@PutMapping("/books/{id}")
	public void updateBook(@RequestBody Book book, @PathVariable int id)
	{
		bookService.update(book,id);
	}
}
