package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.sbean.Cappuccino;
import com.nit.sbean.Coffee;
import com.nit.sbean.Espresso;
import com.nit.sbean.Latte;

@Component
public class CoffeeFactoryImp implements CoffeeFactory {

	@Autowired
	@Qualifier("cpc")
	private Coffee coffee;

	public Coffee getCoffee() {
		return coffee;
	}

	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public Coffee createCoffee(String type) {
		if (type.equalsIgnoreCase("espresso")) {
			coffee = new Espresso();
		} else if (type.equalsIgnoreCase("latte")) {
			coffee = new Latte();
		} else if (type.equalsIgnoreCase("cappuccino")) {
			coffee = new Cappuccino();
		} else {
			throw new IllegalArgumentException("Invalid type...");
		}
		return coffee;

	}

}
