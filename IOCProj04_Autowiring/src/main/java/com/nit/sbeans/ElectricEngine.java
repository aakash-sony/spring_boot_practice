package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngine")
public class ElectricEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("ElectricEngine::started...");

	}

	@Override
	public void stopEngine() {
		System.out.println("ElectricEngine::stopped");

	}

}
