package com.gmail.sendmail.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GEmailSender {

    private String to;
    private String subject;
    private String message;

}
