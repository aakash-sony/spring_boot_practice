package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DieselEngine implements IEngine{

	@Override
	public void startEngine() {
		System.out.println("DieselEngine::started...");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("DieselEngine::stopped...");
		
	}

}
