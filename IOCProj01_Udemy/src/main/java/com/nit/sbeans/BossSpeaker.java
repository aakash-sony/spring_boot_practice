package com.nit.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BossSpeaker implements ISpeaker{

	@Override
	public void makeSound() {
		System.out.println("Boss Speaker sounds good");
		
	}

}
