package com.nit.sbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("com/nit/commons/foodOrdering.properties")
public class RestaurantDetails {
	@Value("${restaurant.name}")
	private String name;
	
	@Value("${restaurant.location}")
	private String location;

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}
}
