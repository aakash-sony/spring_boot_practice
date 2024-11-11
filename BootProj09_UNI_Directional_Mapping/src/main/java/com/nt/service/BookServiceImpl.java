package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Book;
import com.nt.repo.IBookRepo;

@Service
public class BookServiceImpl implements IBookService{

	@Autowired
	private IBookRepo bookRepo;
	@Override
	public Book insertBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public List<Book> getAllBook() {
		return bookRepo.findAll();
	}

	@Override
	public Book getBookById(int id) {
		return bookRepo.findById(id).get();
	}

}
