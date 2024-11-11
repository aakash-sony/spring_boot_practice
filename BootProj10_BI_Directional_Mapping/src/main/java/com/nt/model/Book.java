package com.nt.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Book75")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String title;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Author author;
}
