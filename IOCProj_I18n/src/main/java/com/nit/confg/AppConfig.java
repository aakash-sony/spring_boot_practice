package com.nit.confg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {

	@Bean(name="messageSource")
	public ResourceBundleMessageSource createRBMS() {
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("com/nit/commons/App");
		return source;
	}
}
