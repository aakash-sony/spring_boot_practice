package com.nit.confg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.nit.bean")
@PropertySource("com/nit/commons/info.properties")
public class AppConfig {

}
