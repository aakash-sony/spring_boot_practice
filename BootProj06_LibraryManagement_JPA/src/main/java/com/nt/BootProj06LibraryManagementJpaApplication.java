package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.BookController;

@SpringBootApplication
public class BootProj06LibraryManagementJpaApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(BootProj06LibraryManagementJpaApplication.class, args);
	
	BookController bean = ctx.getBean(BookController.class);
	
	bean.addBook();
	bean.fetchAllBook();
	bean.fetchBookById(52);
	bean.deleteBookById(52);
	bean.updateBook(102);
	}

}
