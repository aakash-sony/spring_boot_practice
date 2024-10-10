package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.bean.Book;
import com.nit.confg.AppConfig;

public class Tester {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Book book = ctx.getBean(Book.class);
		
		book.display();
		ctx.close();
	}
}
