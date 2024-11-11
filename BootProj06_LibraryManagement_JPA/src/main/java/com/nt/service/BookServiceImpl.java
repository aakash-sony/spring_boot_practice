package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Book;
import com.nt.repository.IBookDAO;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	private IBookDAO bookDAO;

	@Override
	public String addBook(Book book) {
		Book b = bookDAO.save(book);
		return b != null ? "Book added successfully.." : "Book not added..";
	}

	@Override
	public Iterable<Book> getAllBooks() {
		Iterable<Book> allBook = bookDAO.findAll();
		return allBook;
	}

	@Override
	public Optional<Book> findBookById(Integer id) {
		if (bookDAO.existsById(id)) {
			Optional<Book> bookById = bookDAO.findById(id);
			return bookById;
		} else {
			throw new IllegalArgumentException("Book is not existed for this " + id);
		}

	}

	@Override
	public String deleteBookById(Integer id) {
		if (bookDAO.existsById(id)) {
			bookDAO.deleteById(id);
			return "Book deleted successfully..";
		} else {
			throw new IllegalArgumentException("Book is not existed for this " + id);
		}
	}

	@Override
	public String updateBook(Book book, Integer id) {
		if(bookDAO.existsById(id))
		{
			book.setId(id);
			bookDAO.save(book);
			return "Book updated successfully..";
		}
		return "Something went wrong with this id: "+id;
	}
}
