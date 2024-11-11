package com.nt.dao;

import java.util.List;

import com.nt.model.Book;

public interface IBookOpDao {
	public int insertBook(Book book);
	public List<Book> getAllBooks();
	public int deleteBook(int id);
	public int updateBook(Book book);
	public Book getBookByid(int id);
}
