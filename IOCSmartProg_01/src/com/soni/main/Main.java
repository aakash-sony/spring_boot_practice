package com.soni.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.soni.config.SpringConfig;
import com.soni.sbeans.Student;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		Student st = ctx.getBean(Student.class);
		st.display();
	}

}
