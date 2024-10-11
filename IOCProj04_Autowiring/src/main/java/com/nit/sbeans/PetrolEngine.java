package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("PetrolEngine::started...");
	}

	@Override
	public void stopEngine() {
		System.out.println("PetrolEngine::stopped...");
	}

}
