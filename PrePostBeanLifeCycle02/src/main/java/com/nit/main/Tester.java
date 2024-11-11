package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.bean.CheckingVotingEligibility;
import com.nit.confg.AppConfig;

public class Tester {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CheckingVotingEligibility bean = ctx.getBean(CheckingVotingEligibility.class);
		
		bean.checkEligibility();
		ctx.close();
	}
	
}
