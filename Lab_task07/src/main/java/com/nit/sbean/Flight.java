package com.nit.sbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("com/nit/commons/flightBooking.properties")
public class Flight {
	@Value("${flight.number}")
	private String flightNumber;
	
	@Value("${flight.departure}")
	private String departureCity;
	
	@Value("${flight.destination}")
	private String destinationCity;
	
	@Value("${flight.price}")
	private double ticketPrice;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", departureCity=" + departureCity + ", destinationCity="
				+ destinationCity + ", ticketPrice=" + ticketPrice + "]";
	}

}
