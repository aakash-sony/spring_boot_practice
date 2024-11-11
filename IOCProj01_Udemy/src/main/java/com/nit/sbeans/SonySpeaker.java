package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component

public class SonySpeaker implements ISpeaker{

	@Override
	public void makeSound() {
		System.out.println("Sony Speaker sounds goods..");
	}

}
