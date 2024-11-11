package com.nt.dao;

import org.springframework.data.repository.CrudRepository;

import com.nt.model.Book;

public interface BookDAO extends CrudRepository<Book, Integer> {
	public Book findByTitle(String title);
}
