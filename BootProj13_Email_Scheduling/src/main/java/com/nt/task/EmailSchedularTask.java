package com.nt.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.nt.service.EmailService;

import lombok.Data;

@Data
@Component
public class EmailSchedularTask {

	@Autowired
	private EmailService service;

	private static final Logger logger = LoggerFactory.getLogger(EmailSchedularTask.class);

	@Scheduled(cron = "0 0/1 0 * * *")
	public void sendScheduledEmail() {
		String to = "babaallrounder702@gmail.com";
		String subject = "Scheduled Email Test";
		String body = "This is a test email sent by Spring Boot Scheduler at " + new java.util.Date();
		System.out.println("Akash");
		logger.info("Initiating scheduled email to {}", to);
		service.sendEmail(to, subject, body);
	}

}
