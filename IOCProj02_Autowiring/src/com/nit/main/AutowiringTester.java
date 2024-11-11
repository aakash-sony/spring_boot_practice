package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.SeasonFinder;

public class AutowiringTester {

	public static void main(String[] args) {
		// Create IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		SeasonFinder generator = ctx.getBean("sf", SeasonFinder.class);

		String msg = generator.findingSeason("Akash");

		System.out.println(msg);

		ctx.close();
	}

}
