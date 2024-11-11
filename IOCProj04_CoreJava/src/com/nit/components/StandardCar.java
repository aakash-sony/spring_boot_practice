package com.nit.components;

public class StandardCar implements ICar{

	@Override
	public void assemble() {
		System.out.println("StandardCar::Alto Car assembled");
		
	}

	@Override
	public void testDrive() {
		System.out.println("StandardCar::ready to test drive.");
		
	}

	@Override
	public void delivery() {
		System.out.println("StandardCar::Ready to deliver");
		
	}

	@Override
	public void drive() {
		System.out.println("StandardCar::customer is driving");
		
	}

}
