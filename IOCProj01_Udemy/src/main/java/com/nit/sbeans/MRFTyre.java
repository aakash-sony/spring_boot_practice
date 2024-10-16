package com.nit.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MRFTyre implements ITyre{

	@Override
	public void rotate() 
	{
		System.out.println("MRF Tyre runs long-losting");	
	}

}
