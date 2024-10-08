package com.nt.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@Autowired
	private LocalTime lTime;

	public String generateMessage() {
		int hour = lTime.getHour();

		if (hour > 3 && hour <= 12) {
			return "Good Morning";
		} else if (hour > 12 && hour <= 15) {
			return "Good AfterNoon";
		} else if (hour > 16 && hour <= 20) {
			return "Good Evening";
		} else {
			return "Good Night";
		}
	}
}
