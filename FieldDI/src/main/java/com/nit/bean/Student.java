package com.nit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Autowired
	private Course course;

	public Course getCourse() {
		return course;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}

}
