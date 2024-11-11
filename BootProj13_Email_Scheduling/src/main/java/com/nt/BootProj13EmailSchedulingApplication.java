package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.nt.task.EmailSchedularTask;

@SpringBootApplication
@EnableScheduling
public class BootProj13EmailSchedulingApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(BootProj13EmailSchedulingApplication.class, args);
	EmailSchedularTask bean = ctx.getBean(EmailSchedularTask.class);
	    bean.sendScheduledEmail();
	}

}
