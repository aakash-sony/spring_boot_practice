package com.nit.service;

import com.nit.sbean.Pizza;

public interface PizzaFactory {
	Pizza creatingPizza(String type, String size, String toppings);
}
