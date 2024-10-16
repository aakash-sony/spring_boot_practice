package com.nit.components;

public class Vehicle {
	private String vehicleName;
	private IEngine engine;
	public Vehicle(String vehicleName, IEngine engine) {
		super();
		this.vehicleName = vehicleName;
		this.engine = engine;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public IEngine getEngine() {
		return engine;
	}
	public void setEngine(IEngine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleName=" + vehicleName + ", engine=" + engine + "]";
	}
	
	
}
