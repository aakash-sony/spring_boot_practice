package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.WeekDayFinder;

public class AutoWiringTester {

	public static void main(String[] args) {
		// Create IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		WeekDayFinder wdf = ctx.getBean("wdf", WeekDayFinder.class);

		String msg = wdf.findingWeekday();

		System.out.println(msg);
		
		ctx.close();
	}
	
}
