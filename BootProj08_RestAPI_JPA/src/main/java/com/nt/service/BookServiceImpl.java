package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.BookDAO;
import com.nt.model.Book;
@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	private BookDAO bookDAO;

	@Override
	public List<Book> getAllBook() {
		List<Book> list = (List<Book>) bookDAO.findAll();
		return list;
	}

	@Override
	public Book getBookById(int id) {
		try {
			Optional<Book> book = bookDAO.findById(id);
			Book b = book.get();
			return b;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Book insertBook(Book book) {
		Book b = bookDAO.save(book);
		return b;
	}

	@Override
	public Book getBookByTitle(String title) {
		Book book = null;
		try {
			book = bookDAO.findByTitle(title);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}

	@Override
	public boolean deleteBookById(int id) {
		if(!bookDAO.existsById(id)) {
			return false;
		}
		bookDAO.deleteById(id);
		return true;
	}
        
	@Override
	public boolean updateBook(Book book, int id) {
		if(!bookDAO.existsById(id))
		{
			return false;
		}
		book.setId(id);
		bookDAO.save(book);	
		return true;
	}
}
