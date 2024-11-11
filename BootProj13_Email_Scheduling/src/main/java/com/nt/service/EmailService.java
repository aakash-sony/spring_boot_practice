package com.nt.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
public class EmailService {
	@Autowired
	private final JavaMailSender mailSender;

    private static final Logger logger = LoggerFactory.getLogger(EmailService.class);

    public void sendEmail(String to, String subject, String body) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("aakashsoni8756@gmail.com");
            message.setTo(to);
            message.setSubject(subject);
            message.setText(body);

            mailSender.send(message);
            logger.info("Email sent successfully to {}", to);
        } catch (Exception e) {
            logger.error("Error sending email to {}: {}", to, e.getMessage());
        }
    }
}
