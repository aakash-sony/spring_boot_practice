package com.nit.bean;

import org.springframework.stereotype.Component;

@Component
public class Course {
	private int courseId;
	private String courseName;
	private String courseTeacher;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseTeacher() {
		return courseTeacher;
	}

	public void setCourseTeacher(String courseTeacher) {
		this.courseTeacher = courseTeacher;
	}

	public void display()
	{
		System.out.println("Course id: "+courseId);
		System.out.println("Course name: "+courseName);
		System.out.println("Course teacher: "+courseTeacher);
	}

}
