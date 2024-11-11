package com.nt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Book;
import com.nt.service.IBookService;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private IBookService service;

	@PostMapping
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		Book insertBook = service.insertBook(book);
		if (insertBook != null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(insertBook);
		} else {
			return ResponseEntity.internalServerError().build();
		}
	}
	
	@GetMapping
	public ResponseEntity<List<Book>> fetchAllBook()
	{
		List<Book> allBook = service.getAllBook();
		if(allBook.size() != 0)
		{
			return ResponseEntity.status(HttpStatus.OK).body(allBook);
		}
		else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Book> fetchBookById(@PathVariable int id)
	{
		Book book = service.getBookById(id);
		if(book != null)
		{
			return ResponseEntity.status(HttpStatus.OK).body(book);
		}
		else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
}
