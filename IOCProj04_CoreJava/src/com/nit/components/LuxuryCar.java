package com.nit.components;

public class LuxuryCar implements ICar{

	@Override
	public void assemble() {
		System.out.println("LuxuryCar::Rolls Royce assembled");
		
	}

	@Override
	public void testDrive() {
		System.out.println("LuxuryCar::Rolls Royce Ready for test drive");
		
	}

	@Override
	public void delivery() {
		System.out.println("LuxuryCar::Delivered to customer.");
		
	}

	@Override
	public void drive() {
		System.out.println("LuxuryCar:Customer is driving.");
		
	}

}
