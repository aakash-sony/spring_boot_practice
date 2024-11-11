package com.nit.sbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("com/nit/commons/hotelReservation.properties")
public class HotelDetails {
	@Value("${hotel.name}")
	private String name;
	
	@Value("${hotel.location}")
	private String location;

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}
}
