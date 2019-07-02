package com.app.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
@Component
public class EmailUtil {
	@Autowired
	private JavaMailSender mailsender;
	public boolean Send(
			String to,
			String subject,
			String text,
			//String [] cc,
			//String [] bcc,
			ClassPathResource file
			) {
	
		boolean flag=false;
		try {
			MimeMessage message= mailsender.createMimeMessage();
			MimeMessageHelper helper=new MimeMessageHelper(
					message,file!=null?true:false);
			//set details
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(text);
			//helper.setCc(cc);
			//helper.setBcc(bcc);
			if(file!=null)
				helper.addAttachment(file.getFilename(), file);
			//send button
			mailsender.send(message);
			flag=true;
		}
		catch(Exception e) {
			flag=false;
			e.printStackTrace();
			
			
		}
		return flag;
	}
	
}
