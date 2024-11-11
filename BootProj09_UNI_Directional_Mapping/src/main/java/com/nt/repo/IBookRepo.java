package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Book;

public interface IBookRepo extends JpaRepository<Book, Integer>{

}
