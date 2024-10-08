package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nt/cnfg/applicationContext.xml")
public class BootProj03LooseCouplingApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj03LooseCouplingApplication.class, args);
		
		Vehicle bean = ctx.getBean(Vehicle.class);
		String name = bean.getName();
		
		System.out.println("Vehicle name : "+name);
		
		bean.getEngine().start();
		bean.journey("Hyderabad", "coorg");
		bean.getEngine().stop();
	}

}
