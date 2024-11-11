package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.confg.AppConfig;
import com.nit.sbean.Reservation;
import com.nit.sbean.HotelDetails;
import com.nit.sbean.User;

public class HotelReservationApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		HotelDetails details = ctx.getBean(HotelDetails.class);
		System.out.println("Welcome to " + details.getName() + " " + details.getLocation());

		User user = ctx.getBean(User.class);
		System.out.println("User info: " + user);

		Reservation rs = ctx.getBean(Reservation.class);
		System.out.println("Reservation details: " + rs);
		System.out.println("Total Bill: " + rs.calculateTotal(3));

	}
}
