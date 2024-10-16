package com.nit.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("com/nit/commons/hotelReservation.properties")
public class Reservation {

	@Value("${reservation.id}")
	private int reservationId;
	@Value("${reservation.name}")
	private String reservationDate;
	@Autowired
	private Room bookedRoom;

	@Override
	public String toString() {
		return "Reservation [reservationId=" + reservationId + ", reservationDate=" + reservationDate + ", bookedRoom="
				+ bookedRoom + "]";
	}

	public int getReservationId() {
		return reservationId;
	}

	public String getReservationDate() {
		return reservationDate;
	}

	public Room getBookedRoom() {
		return bookedRoom;
	}

	public double calculateTotal(int noOfNights) {
		double price = noOfNights * bookedRoom.getPrice();
		return price;
	}

}
