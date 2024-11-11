package com.nt.service;

import java.util.List;

import com.nt.model.Book;

public interface IBookService {
	public Book insertBook(Book book);
	public List<Book> getAllBook();
	public Book getBookById(int id);
	public Book getBookByTitle(String title);
	public boolean deleteBookById(int id);
	public boolean updateBook(Book book, int id);
}
