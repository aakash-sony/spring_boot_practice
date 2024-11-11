package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.bean.Person;
import com.nit.confg.AppConfig;

public class Tester {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person person = ctx.getBean(Person.class);
		person.display();
		ctx.close();
	}
	
}
