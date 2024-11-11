package com.nit.confg;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nit.sbean")
public class AppConfig {

	@Bean("lDate")
	public LocalDate createDate() {
		return LocalDate.now();
	}
}
