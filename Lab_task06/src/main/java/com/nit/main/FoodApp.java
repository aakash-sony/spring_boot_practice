package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.confg.AppConfig;
import com.nit.service.FoodService;

public class FoodApp{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		FoodService bean = ctx.getBean(FoodService.class);
		bean.displayFoodInfo();
		
		ctx.close();
	}
}
