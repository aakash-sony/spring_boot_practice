package com.nit.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name;

	// @Autowired
	private Vehicle vehicle;
	
	private LocalTime lt;

	public Vehicle getVehicle() {
		return vehicle;
	}

	@Autowired
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Bean
	public LocalTime createTime()
	{
		return LocalTime.now();
	}

}
