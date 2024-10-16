package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.confg.AppConfg;
import com.nit.utility.PaymentController;

public class MainTester {
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfg.class);
		PaymentController bean = ctx.getBean(PaymentController.class);
		bean.takingInput();
	}

}
