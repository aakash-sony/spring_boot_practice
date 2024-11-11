package com.nit.bean;


import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@PropertySource("com/nit/commons/info.properties")
public class CheckingVotingEligibility {
	
	@Value("${voter.id}")
	private String voterId;
	
	@Value("${voter.name}")
	private String voterName;
	
	@Value("${voter.age}")
	private Integer voterAge;
	
	private Date verifiedOn;
	
	@PostConstruct
	public void init()
	{
		System.out.println("init() method calling");
		verifiedOn = new Date();
		if(voterName==null || voterAge <= 0)
		{
			throw new IllegalArgumentException("set name and age value..");
		}
	}
	
	public String checkEligibility()
	{
		if(voterAge >= 18)
		{
			return "You are eligible..";
		}
		else
		{
			return "You are not eligible..";
		}
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("All value null");
		voterName = null;
		voterId = null;
		voterAge = null;
	}
	
}
