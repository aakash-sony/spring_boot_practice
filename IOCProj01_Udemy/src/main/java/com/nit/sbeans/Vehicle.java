package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.factory.VehicleService;

@Component
public class Vehicle {
	
	private String name;
	
	@Autowired
	private VehicleService vehicleService;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VehicleService getVehicleService() {
		return vehicleService;
	}

	//@Autowired
	public void setVehicleService(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}

}
