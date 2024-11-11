package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Hotel;

@SpringBootApplication
public class BootProj05ValueInjection01Application {

	public static void main(String[] args) {
		ApplicationContext ctxContext = SpringApplication.run(BootProj05ValueInjection01Application.class, args);
		
		Hotel hotel = ctxContext.getBean("hotel",Hotel.class);
		System.out.println(hotel);
	}

}
