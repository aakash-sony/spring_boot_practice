package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("inApp")
public class InAppNotification implements NotificationStrategy{

	@Override
	public void sendAlert(String message) {
		System.out.println("Sending alert via app notification.."+message);	
	}

}
