package com.mindtree.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

@EnableAsync
@Service
public class Mail {

	@Autowired
	private JavaMailSender jmail;
	
	@Async
	public void sendMail(String to, String subject, String msg) {

		try {
		MimeMessage message =jmail.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		helper.setTo(to);
		helper.setSubject("Bill Details");
		helper.setText(msg, true);
		jmail.send(message);
		}catch(MessagingException e) {
			
		}
	}
}
