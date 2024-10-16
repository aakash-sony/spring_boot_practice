package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("sms")
public class SMSAlert implements NotificationStrategy{

	@Override
	public void sendAlert(String message) {
		System.out.println("Sending alert via SMS.."+message);
	}

}
