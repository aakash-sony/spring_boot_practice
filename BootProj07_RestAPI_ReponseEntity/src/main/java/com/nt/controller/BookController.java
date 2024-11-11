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
import com.nt.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks() {
		List<Book> allBook = bookService.getAllBook();
		if (allBook.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(allBook));
	}

	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBook(@PathVariable int id) {
		Book book = bookService.getBookById(id);
		if (book == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(book));
	}

	@PostMapping("/books")
	public ResponseEntity<Book> insertBook(@RequestBody Book book) {
		Book b = null;
		try {
			b = bookService.addBook(book);
			return ResponseEntity.of(Optional.of(b));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DeleteMapping("/books/{id}")
	public ResponseEntity<Void> deleteBook(@PathVariable int id) {
		try {
			boolean deleteBook = bookService.deleteBook(id);
			if (deleteBook)
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PutMapping("/books/{id}")
	public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable int id) {
		try {
			bookService.update(book, id);
			return ResponseEntity.ok().body(book);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
