package com.nit.main;

import com.nit.factory.VehicleFactory;

public class StrategyDPTest {
public static void main(String[] args) 
{
	VehicleFactory v = new VehicleFactory();
	v.getInstance("petrol");
}
}
