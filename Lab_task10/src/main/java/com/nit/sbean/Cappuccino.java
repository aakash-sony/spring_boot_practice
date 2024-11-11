package com.nit.sbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("cpc")
@PropertySource("com/nit/commons/coffeeMachine.properties")
public class Cappuccino implements Coffee {
	@Value("${cappuccino.name}")
	private String name;
	
	@Value("${cappuccino.price}")
	private double price;

	@Value("${cappuccino.ingredients.milk}")
	private int milk;

	@Value("${cappuccino.ingredients.water}")
	private int water;

	@Value("${cappuccino.ingredients.coffeeBeans}")
	private int coffeeBeans;

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
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

	@Override
	public String toString() {
		return "Cappuccino [name=" + name + ", price=" + price + ", milk=" + milk + ", water=" + water
				+ ", coffeeBeans=" + coffeeBeans + "]";
	}

	@Override
	public void prepare() {
		System.out.println("Cappuccino.prepare() is preparing coffee..");

	}
}
