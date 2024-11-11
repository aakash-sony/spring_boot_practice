package com.nit.factory;

import com.nit.components.ICar;
import com.nit.components.LuxuryCar;
import com.nit.components.SportsCar;
import com.nit.components.StandardCar;

public class CarFactory {
	ICar car = null;
	public ICar getInstance(String carType)
	{
		if(carType.equalsIgnoreCase("luxury"))
		{
			car = new LuxuryCar();
		}
		else if(carType.equalsIgnoreCase("standard"))
		{
			car = new StandardCar();
		}
		else if(carType.equalsIgnoreCase("sports"))
		{
			car = new SportsCar();
		}
		else
		{
			throw new IllegalArgumentException("No valid car..");
		}
		
		car.assemble();
		car.testDrive();
		car.delivery();
		car.drive();
		
		return car;
	}

}
