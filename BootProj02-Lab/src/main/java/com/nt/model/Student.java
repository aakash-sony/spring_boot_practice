package com.nt.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	@Value("${student.name}")
	private String name;
	@Value("${student.type}")
	private String type;
	@Value("${student.age}")
	private int age;
	@Value("${student.major}")
	private String stream;

	public Student(String name, String type, int age, String stream) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
		this.stream = stream;
	}

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", type=" + type + ", age=" + age + ", stream=" + stream + "]";
	}

}
