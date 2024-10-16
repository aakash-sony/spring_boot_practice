package com.nit.sbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("lt")
@PropertySource("com/nit/commons/coffeeMachine.properties")
public class Latte implements Coffee {

	@Value("${latte.name}")
	private String name;

	@Value("${latte.price}")
	private double price;

	@Value("${latte.ingredients.milk}")
	private int milk;

	@Value("${latte.ingredients.water}")
	private int water;

	@Value("${latte.ingredients.coffeeBeans}")
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

	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Latte [name=" + name + ", price=" + price + ", milk=" + milk + ", water=" + water + ", coffeeBeans="
				+ coffeeBeans + "]";
	}

	@Override
	public void prepare() {
		System.out.println("Latte.prepare() is preparing coffee..");
	}
}
