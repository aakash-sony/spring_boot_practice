package com.nt.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("fuel")
public class Fuel {
	@Value("${fuel.type}")
	private String fuelType;
	
	@Value("${fuel.rate}")
	private double fuelRate;
	
	@Value("${fuel.quality}")
	private String fuelQuality;

	public Fuel(String fuelType, double fuelRate, String fuelQuality) {
		super();
		this.fuelType = fuelType;
		this.fuelRate = fuelRate;
		this.fuelQuality = fuelQuality;
	}

	public Fuel() {
		super();
	}



	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public double getFuelRate() {
		return fuelRate;
	}

	public void setFuelRate(double fuelRate) {
		this.fuelRate = fuelRate;
	}

	public String getFuelQuality() {
		return fuelQuality;
	}

	public void setFuelQuality(String fuelQuality) {
		this.fuelQuality = fuelQuality;
	}

	@Override
	public String toString() {
		return "Fuel [fuelType=" + fuelType + ", fuelRate=" + fuelRate + ", fuelQuality=" + fuelQuality + "]";
	}

}
