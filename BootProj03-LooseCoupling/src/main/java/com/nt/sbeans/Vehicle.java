package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	@Value("${vehicle.name}")
	String name;
	@Autowired
	@Qualifier("motor")
	private IEngine engine;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IEngine getEngine() {
		return engine;
	}

	public void setEngine(IEngine engine) {
		this.engine = engine;
	}

	public void journey(String startingPoint, String destination) {
		System.out.println("Journey start from " + startingPoint + " to " + destination);
	}

}
