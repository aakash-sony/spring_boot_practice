package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DieselEngine implements IEngine{

	@Override
	public void start() {
		System.out.println("DieselEngine.start()");
		
	}

	@Override
	public void stop() {
		System.out.println("DieselEngine.stop()");
		
	}

}
