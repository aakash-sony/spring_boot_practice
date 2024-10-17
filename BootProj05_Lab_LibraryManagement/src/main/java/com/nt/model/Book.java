package com.nt.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Book {
	private Integer bookId;
	private String bookTitle;
	private String bookAuthor;
	private Double bookPrice;
	private Integer bookQty;
}
