package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nt.model.Book;

@Service
public class BookService {

	private static List<Book> list = new ArrayList<Book>();

	static {
		list.add(new Book(121, "Java", "James"));
		list.add(new Book(122, "C++", "ABC"));
		list.add(new Book(123, "Python", "XYZ"));
	}

	public List<Book> getAllBook() {
		return list;
	}

	public Book getBookById(int id) {
		Book bookById = list.stream().filter(book -> book.getId() == id).findFirst().get();
		return bookById;
	}

	public Book addBook(Book book) {
		list.add(book);
		return book;
	}

	public void deleteBook(int id) {
		list = list.stream().filter(Book -> Book.getId() != id).collect(Collectors.toList());
	}

	public void update(Book book, int id) {
		list = list.stream().map(b -> {
			if (b.getId() == id) {
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
			}
			return b;
		}).collect(Collectors.toList());

	}
}
