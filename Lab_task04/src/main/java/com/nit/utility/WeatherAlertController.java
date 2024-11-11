package com.nit.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.sbeans.NotificationStrategy;
import com.nit.sbeans.User;

@Component
public class WeatherAlertController {

	@Autowired
	@Qualifier("sms")
	private NotificationStrategy smsAlert;

	@Autowired
	@Qualifier("email")
	private NotificationStrategy emailAlert;

	@Autowired
	@Qualifier("inApp")
	private NotificationStrategy inAppAlert;

	private final WeatherAlertService weatherAlertService;

	@Autowired
	public WeatherAlertController(WeatherAlertService weatherAlertService) {
		super();
		this.weatherAlertService = weatherAlertService;
	}

	public void alertUser(User user, String severity) 
	{
		switch (user.getPreferredNotificationMethod().toLowerCase()) {
		case "sms":
			weatherAlertService.setStrategy(smsAlert);
			break;
		case "email":
			weatherAlertService.setStrategy(emailAlert);
			break;
		case "in-app":
			weatherAlertService.setStrategy(inAppAlert);
			break;
		default:
			throw new IllegalArgumentException("Unknown notification method");
		}
		
		switch(severity) {
		   case "severe":
               weatherAlertService.notifyUser("Severe weather alert! Please take necessary precautions.");
               break;
           case "moderate":
               weatherAlertService.notifyUser("Moderate weather alert! Stay tuned for updates.");
               break;
           case "mild":
               weatherAlertService.notifyUser("Mild weather alert! All is calm for now.");
               break;
           default:
               System.out.println("Unknown severity level.");
       }
		
	}
}
