package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.model.Book;

public interface IBookDAO extends CrudRepository<Book, Integer>{

}
