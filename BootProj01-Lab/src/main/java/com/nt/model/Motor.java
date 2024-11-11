package com.nt.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("motor")
public class Motor {
	@Value("${motor.type}")
	private String motorType;
	
	@Value("${motor.power}")
	private int motorPower;
	
	@Autowired
	private Fuel fuel;
	
	
	public Motor() {
		super();
	}

	public Motor(String motorType, int motorPower, Fuel fuel) {
		super();
		this.motorType = motorType;
		this.motorPower = motorPower;
		this.fuel = fuel;
	}

	public Fuel getFuel() {
		return fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	public String getMotorType() {
		return motorType;
	}

	public void setMotorType(String motorType) {
		this.motorType = motorType;
	}

	public int getMotorPower() {
		return motorPower;
	}

	public void setMotorPower(int motorPower) {
		this.motorPower = motorPower;
	}

	@Override
	public String toString() {
		return "Motor [motorType=" + motorType + ", motorPower=" + motorPower + ", fuel=" + fuel + "]";
	}


}
