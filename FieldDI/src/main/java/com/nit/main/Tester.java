package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.bean.Student;
import com.nit.confg.AppConfig;

public class Tester {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Student std = ctx.getBean(Student.class);

		std.getCourse().setCourseId(101);
		std.getCourse().setCourseName("Java");
		std.getCourse().setCourseTeacher("Natraj");
		std.getCourse().display();

		ctx.close();
	}

}
