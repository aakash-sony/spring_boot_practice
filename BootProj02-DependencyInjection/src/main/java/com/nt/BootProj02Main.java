package com.nt;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WishMessageGenerator;

@SpringBootApplication
public class BootProj02Main {

	@Bean(name="lt")
	public LocalTime getTime() {
		return LocalTime.now();
	}
                                     
	public static void main(String[] args) {
		ApplicationContext Context = SpringApplication.run(BootProj02Main.class, args);

		WishMessageGenerator bean = Context.getBean("wmg", WishMessageGenerator.class);

		String message = bean.generateMessage();
		System.out.println(message);
	}

}
