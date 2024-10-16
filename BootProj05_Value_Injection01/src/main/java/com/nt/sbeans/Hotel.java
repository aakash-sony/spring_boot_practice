package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("hotel")
@Data
public class Hotel {
	@Value("${hotel.id}")
	private Integer hotelId;
	@Value("${hotel.name}")
	private String hotelName;
	@Value("${hotel.address}")
	private String hotelAddr;
	@Value("${hotel.contact}")
	private String hotelContactNum;
	@Value("${customer.name}")
	private String customerName;
	@Value("#{menu.idlyPrice + menu.pohaPrice}")
	private Float billAmount;
	@Value("${user.name}")
	private String windowsUser;
	@Value("${os.name}")
	private String osName;
	@Value("${path}")
	private String pathData;
}
