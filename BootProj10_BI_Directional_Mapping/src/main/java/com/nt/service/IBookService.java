package com.nt.service;

import java.util.List;

import com.nt.model.Book;

public interface IBookService {
	public Book insertBook(Book book);
	public List<Book> getAllBook();
	public Book getBookById(int id);
}
