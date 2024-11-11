package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.bean.Server;
import com.nit.confg.AppConfig;

public class Tester {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Server server = ctx.getBean(Server.class);
		
		server.serve();
		ctx.close();
	}
	
}
