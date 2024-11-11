package com.nt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Book;
import com.nt.service.IBookService;

@RestController
public class BookController {
	@Autowired
	private IBookService service;

	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks() {
		List<Book> allBook = service.getAllBook();
		if (allBook.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(allBook);
		}
	}

	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable int id) {
		Book book = service.getBookById(id);
		if (book == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} else {
			return ResponseEntity.of(Optional.of(book));
		}
	}

	@PostMapping("/books")
	public ResponseEntity<Book> insertBook(@RequestBody Book book) {
		Book b = null;
		try {
			b = service.insertBook(book);
			return ResponseEntity.status(HttpStatus.CREATED).body(b);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DeleteMapping("/books/{id}")
	public ResponseEntity<Void> deleteBookById(@PathVariable int id) {
		try {
			boolean deleted = service.deleteBookById(id);
			if (deleted)
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			else {
				return ResponseEntity.notFound().build();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PutMapping("/books/{id}")
	public ResponseEntity<Book> updateBookById(@RequestBody Book book, @PathVariable int id) {
		try {
			boolean updateBook = service.updateBook(book, id);
			if (updateBook) {
				return ResponseEntity.status(HttpStatus.CREATED).body(book);
			} else {
				return ResponseEntity.notFound().build();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.internalServerError().build();
		}
	}

	@GetMapping("/books/title/{title}")
	public ResponseEntity<Book> getBookByTitle(@PathVariable String title) {
		Book b = service.getBookByTitle(title);
		if (b == null)
			return ResponseEntity.notFound().build();
		else
			return ResponseEntity.status(HttpStatus.OK).body(b);
	}

}
