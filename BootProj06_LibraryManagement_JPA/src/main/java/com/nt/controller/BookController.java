package com.nt.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Book;
import com.nt.service.IBookService;

@Controller
public class BookController{

	@Autowired
	private IBookService service;
	
	public void addBook()
	{
		Book b1 = new Book();
		b1.setName("Java");
		b1.setAuthor("James Gosling");
		b1.setPrice(240.0);
		b1.setQty(5);
		
		String result = service.addBook(b1);
		System.out.println(result);
	}
	
	public void fetchAllBook()
	{
		Iterable<Book> allBooks = service.getAllBooks();
		allBooks.forEach(System.out::println);
	}
	
	public void fetchBookById(Integer id)
	{
		Optional<Book> bookById = service.findBookById(id);
		System.out.println(bookById);
	}
	
	public void deleteBookById(Integer id)
	{
		String result = service.deleteBookById(id);	
		System.out.println(result);
	}
	
	public void updateBook(Integer id)
	{
		Book book = new Book();
		book.setAuthor("Akash");
		String result = service.updateBook(book, id);
		System.out.println(result);
	}

}
