package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailNotification implements NotificationStrategy {

	@Override
	public void sendAlert(String message) {
		System.out.println("Sending alert via Email.."+message);	
	}

}
