package com.nit.service;

import com.nit.sbean.Coffee;

public interface CoffeeFactory {
	Coffee createCoffee(String type);
}
