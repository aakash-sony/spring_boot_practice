package com.soni.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Akash")
	private String name;
	@Value("Hyd")
	private String address;
	@Value("8303677522")
	private long phoneNum;
    
	private LocalTime lt;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Mobile: " + phoneNum);
	}

}
