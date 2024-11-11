package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.model.Fuel;
import com.nt.model.Motor;

@SpringBootApplication
public class MotorTester {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MotorTester.class, args);
	
		Motor bean = context.getBean("motor",Motor.class);
	    System.out.println(bean);
	}

}
