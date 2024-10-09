package com.nit.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nit.sbeans")
public class AppConfig {
	public AppConfig() {}
	
	@Bean(name="cdate")
	public LocalDate createDate()
	{
		return LocalDate.now();
	}
}
