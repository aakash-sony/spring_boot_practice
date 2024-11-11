package com.nit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name;
	private int age;

	@Autowired
	public Person(@Value("Akash") String name, @Value("23") int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("Person name: " + name);
		System.out.println("Person age: " + age);
	}
}
