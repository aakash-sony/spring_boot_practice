package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.confg.AppConfg;
import com.nit.sbeans.Student;

public class MainTester {
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfg.class);
		Student bean = ctx.getBean(Student.class);
		System.out.println(bean.toString());

	}

}
