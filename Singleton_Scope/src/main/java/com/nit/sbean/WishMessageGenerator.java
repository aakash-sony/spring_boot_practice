package com.nit.sbean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishMessageGenerator {
	@Autowired
	private LocalDate lDate;
	
	public WishMessageGenerator()
	{
		System.out.println("WishMessageGenerator::0 param constructor");
	}
}
