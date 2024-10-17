package com.nt.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("hotel")
@Setter
@ToString
@ConfigurationProperties(prefix = "hotel")
public class Hotel {

	private Integer hotelId;

	private String hotelName;

	private String hotelAddress;

	private String hotelContact;
	@Value("${customer.name}")
	private String customerName;
	
	@Autowired
	private MenuItem menu;

}
