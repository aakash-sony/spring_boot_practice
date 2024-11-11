package com.nit.sbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("esp")
@PropertySource("com/nit/commons/coffeeMachine.properties")
public class Espresso implements Coffee {

	@Value("${espresso.name}")
	private String name;

	@Value("${espresso.price}")
	private double price;

	@Value("${espresso.ingredients.water}")
	private int water;

	@Value("${espresso.ingredients.coffeeBeans}")
	private int coffeeBeans;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getCoffeeBeans() {
		return coffeeBeans;
	}

	public void setCoffeeBeans(int coffeeBeans) {
		this.coffeeBeans = coffeeBeans;
	}
	

	@Override
	public String toString() {
		return "Espresso [name=" + name + ", price=" + price + ", water=" + water + ", coffeeBeans=" + coffeeBeans
				+ "]";
	}

	@Override
	public void prepare() {
		System.out.println("Espresso.prepare() method is preparing coffee..");
	}

}
