package com.nit.main;

import java.util.ArrayList;
import java.util.List;

import com.nit.components.ICar;
import com.nit.factory.CarFactory;

public class Customer {

	public static void main(String[] args) {
		List<ICar> list = new ArrayList<ICar>();
		
		list.add(new CarFactory().getInstance("luxury"));
		list.add(new CarFactory().getInstance("standard"));
		list.add(new CarFactory().getInstance("sports"));
		
		list.forEach(System.out::println);
	}

}
