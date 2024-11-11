package com.nt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="MyBooks")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="book_code")
	private Integer id;
	private String title;
	private String author;
	private double price;
	private Integer qty;
}
