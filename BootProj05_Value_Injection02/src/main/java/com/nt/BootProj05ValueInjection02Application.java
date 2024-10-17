package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.model.Hotel;

@SpringBootApplication
public class BootProj05ValueInjection02Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj05ValueInjection02Application.class, args);
		Hotel hotel = ctx.getBean("hotel",Hotel.class);
		System.out.println(hotel);
	}

}
