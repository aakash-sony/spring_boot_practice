package com.nit.main;

import java.time.LocalTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.confgs.AppConfig;
import com.nit.sbeans.Person;

public class ApplicationTester {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
	    Person person = ctx.getBean(Person.class);
	    person.setName("Akash");
	    System.out.println("Owner Name: "+person.getName());
	    LocalTime t = person.createTime();
	    System.out.println(t);
		person.getVehicle().getVehicleService().moveVehicle();	
		person.getVehicle().getVehicleService().playMusic();	
	
	ctx.close();
	}
   
}
