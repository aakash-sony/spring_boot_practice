package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.confg.AppConfig;
import com.nit.sbean.Flight;
import com.nit.sbean.User;

public class FlightMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Flight bean1 = ctx.getBean(Flight.class);
		System.out.println(bean1);

		User bean2 = ctx.getBean(User.class);
		System.out.println(bean2);

		ctx.close();
	}
}
