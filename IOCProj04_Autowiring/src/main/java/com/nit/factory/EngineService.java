package com.nit.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.sbeans.IEngine;

@Component
public class EngineService {
	
	@Autowired
	@Qualifier("dEngine")
	private IEngine engine;

	public EngineService(IEngine engine)
	{
		this.engine = engine;
	}
	public EngineService()
	{
		
	}

	public IEngine getEngine() {
		return engine;
	}

	public void setEngine(IEngine engine) {
		this.engine = engine;
	}

	public void engineChecking()
	{
	   engine.startEngine();
	   engine.stopEngine();
	}
}
