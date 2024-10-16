package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.sbean.Margherita;
import com.nit.sbean.Pepperoni;
import com.nit.sbean.Pizza;
import com.nit.sbean.Veggie;

@Component
public class PizzaFactoryImpl implements PizzaFactory {
	@Autowired
	private Pizza margherita;

	@Override
	public Pizza creatingPizza(String type, String size, String toppings) {
		Pizza pizza = null;
		if(type.equalsIgnoreCase("margherita"))
		{
		  pizza = new Margherita();
		}
		else if(type.equalsIgnoreCase("pepperoni"))
		{
			pizza = new Pepperoni();
		}
		else if(type.equalsIgnoreCase("veggie"))
		{
			pizza = new Veggie();
		}
		return pizza;
		
	}

	
}
