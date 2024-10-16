package com.nit.confg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.nit.sbean","com.nit.service"})
@PropertySource("com/nit/commons/flightBooking.properties")
public class AppConfig {
}
