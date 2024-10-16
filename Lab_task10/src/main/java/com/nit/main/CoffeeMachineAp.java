package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.confg.AppConfig;
import com.nit.sbean.Coffee;
import com.nit.service.CoffeeFactoryImp;

public class CoffeeMachineAp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		CoffeeFactoryImp factory = ctx.getBean(CoffeeFactoryImp.class);

		Coffee coffee = factory.getCoffee();

		System.out.println(coffee);
		
		coffee.prepare();
		ctx.close();
	}
}
