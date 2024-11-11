package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.sbean.FoodDetails;

@Service
public class FoodService {
	@Autowired
	private FoodDetails foodDetails;

	public FoodService(FoodDetails foodDetails) {
		super();
		this.foodDetails = foodDetails;
	}

	public void displayFoodInfo() {
		System.out.println("Food Id: " + foodDetails.getFoodId());
		System.out.println("Food Name: " + foodDetails.getFoodName());
		System.out.println("Food preparation Time in minutes: " + foodDetails.getPreparationTime());
		System.out.println("Restaurant Name: " + foodDetails.getRestaurantName());
	}
}
