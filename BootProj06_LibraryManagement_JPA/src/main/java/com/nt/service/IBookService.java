package com.nt.service;

import java.util.Optional;

import com.nt.model.Book;

public interface IBookService {
	String addBook(Book book);
	Iterable<Book> getAllBooks();
	Optional<Book> findBookById(Integer id);
	String deleteBookById(Integer id);
	String updateBook(Book book, Integer id);
}
