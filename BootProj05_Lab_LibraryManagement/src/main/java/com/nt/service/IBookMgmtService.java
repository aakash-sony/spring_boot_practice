package com.nt.service;

import java.util.List;

import com.nt.model.Book;

public interface IBookMgmtService {

	public String addBook(Book book);
	public List<Book> retrieveAllBook();
	public String deleteBook(int id);
	public String updateBook(Book book);
	public Book getBookById(int id);
}
