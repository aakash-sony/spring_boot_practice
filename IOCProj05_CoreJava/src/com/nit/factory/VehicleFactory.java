package com.nit.factory;

import com.nit.components.DieselEngine;
import com.nit.components.ElectricEngine;
import com.nit.components.IEngine;
import com.nit.components.PetrolEngine;
import com.nit.components.Vehicle;

public class VehicleFactory 
{
	public IEngine engine = null;
	
	Vehicle v = new Vehicle("ABC",engine);
	
	public IEngine getInstance(String engineType)
	{
		if(engineType.equals("petrol"))
		{
			engine = new PetrolEngine();
		}
		else if(engineType.equals("diesel"))
		{
			engine = new DieselEngine();
		}
		else if(engineType.equals("electric"))
		{
			engine = new ElectricEngine();
		}
		else
		{
			throw new IllegalArgumentException("no engine available");
		}
		
		engine.engineAssembly();
		return engine;
	}
}
