package com.soni.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.soni.sbeans")
@ComponentScan(basePackages = {"com.soni.sbeans"})
public class SpringConfig {

	@Bean
	public LocalTime createTime()
	{
		return LocalTime.now();
	}

}
