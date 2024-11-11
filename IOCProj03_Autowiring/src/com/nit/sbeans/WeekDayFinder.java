//WeekdayFinder.java
package com.nit.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder {
	// Field Injection
	@Autowired
	private LocalDateTime lDt;

	public WeekDayFinder() {

	}
	
	public String findingWeekday()
	{
		DayOfWeek day = lDt.getDayOfWeek();
		
		if(day.equals("Saturday") || day.equals("Sunday"))
		{
			return "Happy Weekends...";
		}
		else
		{
			return "Oops! This is working day";
		}
		
	}
}
