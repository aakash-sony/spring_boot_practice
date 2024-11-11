package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.model.Student;
import com.nt.model.University;

@SpringBootApplication
public class StudentTester {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StudentTester.class, args);
	
		University bean = context.getBean("university",University.class);
	    System.out.println(bean);
	}

}
