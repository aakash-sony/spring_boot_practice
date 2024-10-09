//WishMessageGenerator(Target Class)
package com.nit.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired //Field Injection
	private LocalTime it;  //HAS-A Relationship

	public WishMessageGenerator() {

	}

	public String generateMessage(String user) {
		int hour = it.getHour();

		if (hour < 12) {
			return "Good Morning-" + user;
		} else if (hour < 16) {
			return "Good Afternoon-" + user;
		} else if (hour < 20) {
			return "Good Evening-" + user;
		} else {
			return "Good Night-" + user;
		}
	}
}
