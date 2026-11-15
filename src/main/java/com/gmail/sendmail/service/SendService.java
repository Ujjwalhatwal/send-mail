package com.gmail.sendmail.service;

import com.gmail.sendmail.model.GEmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendService {

    @Autowired
    JavaMailSender javaMailSender;

    public String sendMail(GEmailSender mailSender) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(mailSender.getTo());
        message.setSubject(mailSender.getSubject());
        message.setText(mailSender.getMessage());

        javaMailSender.send(message);
        return "SENT";
    }
}
