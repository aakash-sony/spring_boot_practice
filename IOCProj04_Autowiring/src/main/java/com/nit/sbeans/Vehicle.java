package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.factory.EngineService;

@Component
public class Vehicle {
	@Autowired
	private EngineService service;

	public Vehicle(EngineService service) {
		this.service = service;
	}
	public Vehicle() {

	}

	public EngineService getService() {
		return service;
	}

	public void setService(EngineService service) {
		this.service = service;
	}

}
