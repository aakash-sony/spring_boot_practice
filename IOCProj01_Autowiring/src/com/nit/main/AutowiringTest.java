package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.WishMessageGenerator;

public class AutowiringTest {

	public static void main(String[] args) {
		//Create IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
	
		String msg  = generator.generateMessage("Akash");
		
		System.out.println("Result: "+msg);
		
		ctx.close();
	}

}
