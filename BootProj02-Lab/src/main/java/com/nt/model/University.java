package com.nt.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("university")
public class University {
	@Value("${university.name}")
	private String name;
	
	@Value("${university.location}")
	private String location;
	
	@Value("${university.ranking}")
	private int ranking;
	
	@Autowired
	private Student student;

	public University(String name, String location, int ranking, Student student) {
		super();
		this.name = name;
		this.location = location;
		this.ranking = ranking;
		this.student = student;
	}

	public University() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return "University [name=" + name + ", location=" + location + ", ranking=" + ranking + ", student=" + student
				+ "]";
	}	
}
