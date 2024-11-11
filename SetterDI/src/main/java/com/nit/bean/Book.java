package com.nit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

	private String title;
	private String author;

	public String getTitle() {
		return title;
	}

	@Autowired
	public void setTitle(@Value("Java")String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	@Autowired
	public void setAuthor(@Value("James gosling")String author) {
		this.author = author;
	}

	public void display() {
		System.out.println("Book title: " + title);
		System.out.println("Book author: " + author);
	}
}
