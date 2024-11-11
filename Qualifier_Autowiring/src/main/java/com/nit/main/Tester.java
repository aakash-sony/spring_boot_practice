package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.bean.PaymentsProcessor;
import com.nit.confg.AppConfig;

public class Tester {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		PaymentsProcessor processor = ctx.getBean(PaymentsProcessor.class);
		
		processor.getMethod().payment();
		
		ctx.close();
		
	}
	
}
