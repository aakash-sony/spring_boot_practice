package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.confg.AppConfig;
import com.nit.sbean.Order;
import com.nit.sbean.RestaurantDetails;
import com.nit.sbean.User;

public class FoodOrderingApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		RestaurantDetails details = ctx.getBean(RestaurantDetails.class);
		System.out.println("Welcome to " + details.getName() + " " + details.getLocation());

		User user = ctx.getBean(User.class);
		System.out.println("User info: " + user);

		Order order = ctx.getBean(Order.class);
		System.out.println("Order details: " + order);
		System.out.println("Total Bill: " + order.calculateTotal());

	}
}
