package com.nt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Order65")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String order_date;
	private String customerName;
	private double total_amount;
}
