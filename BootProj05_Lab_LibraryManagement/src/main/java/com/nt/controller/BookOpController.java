package com.nt.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Book;
import com.nt.service.BookMgmtServiceImpl;

@Controller
public class BookOpController {

	Scanner scanner = new Scanner(System.in);
	@Autowired
	private BookMgmtServiceImpl service;

	public void addBook() {
		System.out.print("Enter Book name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Book Author name: ");
		String author = scanner.nextLine();

		System.out.print("Enter Book Price: ");
		Double price = scanner.nextDouble();

		System.out.print("Enter Book Quantity: ");
		int qty = scanner.nextInt();

		Book book = new Book();
		book.setBookTitle(name);
		book.setBookAuthor(author);
		book.setBookPrice(price);
		book.setBookQty(qty);

		String result = service.addBook(book);
		System.out.println(result);
	}

	public void findAllBook() {
		System.out.println("Book Details:- ");
		List<Book> allBook = service.retrieveAllBook();
		allBook.forEach(Book -> {
			System.out.println(Book.getBookId() + " " + Book.getBookTitle() + " " + Book.getBookAuthor() + " "
					+ Book.getBookPrice() + " " + Book.getBookQty());
		});
	}
	
	public void deleteBook()
	{
		System.out.print("Enter Book id to delete: ");
		int id = scanner.nextInt();
		String result = service.deleteBook(id);
		System.out.println(result);
	}
	
	public void updateBook()
	{
		System.out.print("Enter Book id to Update: ");
		int id = scanner.nextInt();
		System.out.print("Enter new Book name: ");
		String name = scanner.nextLine();
		name = scanner.nextLine();
		System.out.print("Enter new Book Author: ");
		String author = scanner.nextLine();
		System.out.print("Enter new Book Price: ");
		double price = scanner.nextDouble();
		System.out.print("Enter Book Quantity: ");
		int qty = scanner.nextInt();
		
		Book book = service.getBookById(id);
		book.setBookTitle(name);
		book.setBookAuthor(author);
		book.setBookPrice(price);
		book.setBookQty(qty);
		
		String result = service.updateBook(book);
		System.out.println(result);
	}
}
