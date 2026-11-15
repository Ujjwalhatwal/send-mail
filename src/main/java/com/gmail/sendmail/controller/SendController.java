package com.gmail.sendmail.controller;


import com.gmail.sendmail.model.GEmailSender;
import com.gmail.sendmail.service.SendService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class SendController {

    private final SendService sendService;

    @GetMapping("/")
    public String emailForm(){
        return "MailSenderForm";
    }

    @PostMapping("/send-mail")
    @ResponseBody
    public String sendMail(@ModelAttribute GEmailSender mailSender) {
        // Logic to send the email using the provided details
        return sendService.sendMail(mailSender);
    }
}
