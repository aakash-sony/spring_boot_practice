package com.nit.bean;


import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Server {

	private String connection;
	
	@PostConstruct
	public void init()
	{
		connection = "Connection established..";
		
		System.out.println("Server initialized.."+connection);
	}
	
	@PreDestroy
	public void destroy()
	{
		connection = "Connection closed..";
		System.out.println("Server cleaned up..."+connection);
	}
	
	public void serve()
	{
		System.out.println("Server:::serve");
	}
}
