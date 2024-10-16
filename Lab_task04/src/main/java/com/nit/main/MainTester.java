package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.confg.AppConfg;
import com.nit.sbeans.User;
import com.nit.utility.WeatherAlertController;

public class MainTester {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfg.class);
		
		WeatherAlertController bean = ctx.getBean(WeatherAlertController.class);
		
		User user1 = new User("John Doe", "sms");
		User user2 = new User("Jane Smith", "email");
		User user3 = new User("Bob Johnson", "in-app");
		
		bean.alertUser(user1, "severe");
		bean.alertUser(user2, "moderate");
		bean.alertUser(user3, "mild");
                                               
		ctx.close(); 
	}

}
