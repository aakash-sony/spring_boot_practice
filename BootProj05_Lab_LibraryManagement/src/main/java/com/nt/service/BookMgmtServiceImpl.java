package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IBookOpDao;
import com.nt.model.Book;

@Service
public class BookMgmtServiceImpl implements IBookMgmtService {
	@Autowired
	private IBookOpDao bookOpDao;

	@Override
	public String addBook(Book book) {
		int insertBook = bookOpDao.insertBook(book);
		return insertBook != 0 ? "Book inserted successfully":"Something went wrong";
	}

	@Override
	public List<Book> retrieveAllBook() {
		return bookOpDao.getAllBooks();
	}

	@Override
	public String deleteBook(int id) {
		int deleteBook = bookOpDao.deleteBook(id);
		return deleteBook != 0 ? "Book deleted successfully":"Something went wrong";
	}

	@Override
	public String updateBook(Book book) {
		int updateBook = bookOpDao.updateBook(book);
		return updateBook != 0 ? "Book Updated successfully":"Something went wrong..";
	}

	@Override
	public Book getBookById(int id) {
		return bookOpDao.getBookByid(id);
	}

}
