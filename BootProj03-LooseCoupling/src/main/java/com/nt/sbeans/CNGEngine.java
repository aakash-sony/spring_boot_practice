package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("cngEngine")
public class CNGEngine implements IEngine{

	@Override
	public void start() {
	System.out.println("CNGEngine.start()");
	}

	@Override
	public void stop() {
		System.out.println("CNGEngine.stop()");
		
	}

}
