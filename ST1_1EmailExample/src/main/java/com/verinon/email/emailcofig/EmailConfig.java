package com.verinon.email.emailcofig;



import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
@Component
public class EmailConfig {
	@Autowired
private	JavaMailSender sender;
	public EmailConfig() {
		System.out.println("Config Class");
	}
	
	
	public boolean emailSend() throws Exception
	{
		System.out.println("Email Sending method !!");
MimeMessage message=	sender.createMimeMessage();
MimeMessageHelper helper=new MimeMessageHelper(message,false);
helper.setTo("ramemahe143@gmail.com");
helper.setSubject("Test Mail");
helper.setText("Hi i am testing email !!");
helper.setFrom("rameshgeeta246@gmail.com");

	
	sender.send(message);
	
		return true;
	}

}
