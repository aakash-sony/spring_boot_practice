package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.confg.AppConfg;
import com.nit.utility.DiscountService;


public class MainTester {
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfg.class);
		DiscountService bean = ctx.getBean(DiscountService.class);
		bean.getDiscount().applyDiscount(120);
		
	}

}
