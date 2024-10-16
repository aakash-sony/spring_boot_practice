package com.nit.components;

public class SportsCar implements ICar{

	@Override
	public void assemble() {
		System.out.println("Sportscar::Ferrari assembled");
		
	}

	@Override
	public void testDrive() {
		System.out.println("Sportscar::Ferrari ready for test Drive");
		
	}

	@Override
	public void delivery() {
		System.out.println("Sportscar::Ferrari is ready for delivery.");
		
	}

	@Override
	public void drive() {
		System.out.println("Sportscar::customer is driving..");
		
	}

}
