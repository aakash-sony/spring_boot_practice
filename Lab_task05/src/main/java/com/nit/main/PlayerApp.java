package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.confg.AppConfig;
import com.nit.service.PlayerService;

public class PlayerApp{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		PlayerService bean = ctx.getBean(PlayerService.class);
		bean.displayPlayerInfo();
		
		ctx.close();
	}
}
