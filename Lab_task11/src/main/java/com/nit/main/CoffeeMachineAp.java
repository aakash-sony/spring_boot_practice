package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.confg.AppConfig;
import com.nit.sbean.Pizza;
import com.nit.service.PizzaFactoryImpl;

public class CoffeeMachineAp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		PizzaFactoryImpl factory = ctx.getBean(PizzaFactoryImpl.class);

		Pizza coffee = factory.creatingPizza(null, null, null);

		System.out.println(coffee);
		
		coffee.prepare();
		ctx.close();
	}
}
