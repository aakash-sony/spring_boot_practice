package com.nit.utility;

import org.springframework.stereotype.Component;

import com.nit.sbeans.NotificationStrategy;

@Component
public class WeatherAlertService
{
	private NotificationStrategy strategy;

	public void setStrategy(NotificationStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void notifyUser(String message)
	{
		if(strategy != null)
		{
			strategy.sendAlert(message);
		}
		else {
			System.out.println("No notification strategy set");
		}
	}
}
