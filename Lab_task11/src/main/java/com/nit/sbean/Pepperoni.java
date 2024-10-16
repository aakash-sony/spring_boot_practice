package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component("pprn")
public class Pepperoni implements Pizza {
	private String name;
	private String ingredients;
	private double basePrice;
	private double sizePrice;
	private String toppings;
	private String pizzaSize;
	

	public String getPizzaSize() {
		return pizzaSize;
	}

	public void setPizzaSize(String pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public double getSizePrice() {
		switch (pizzaSize) {
		case "large":
			return 300;
		case "medium":
			return 200;
		case "small":
			return 100;
		default:
			return 0;
		}
	}

	public void setSizePrice(double sizePrice) {
		this.sizePrice = sizePrice;
	}

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	@Override
	public String getDescription() {
		return "[ " + name + " " + ingredients + " " + "Toppings: " + toppings + " Extra Price for Size: " + sizePrice
				+ " Base Price: " + basePrice + "]";
	}

	@Override
	public double getPrice() {
		return basePrice + getSizePrice() + toppingPrice();

	}

	public double toppingPrice() {
		switch (toppings) {
		case "extraCheese":
			return 75;
		case "mushroom":
			return 40;
		case "olives":
			return 52;
		default:
			return 0;
		}
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name + " with " + ingredients);

	}

}
