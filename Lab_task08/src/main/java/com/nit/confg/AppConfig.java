package com.nit.confg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.nit.sbean"})
@PropertySource("com/nit/commons/foodOrdering.properties")
public class AppConfig {
}
