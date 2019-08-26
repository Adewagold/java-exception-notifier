package com.exception.notifier.config;

import com.exception.notifier.mail.EmailService;
import com.exception.notifier.service.NotificationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * *  Created by Adewale Adeleye on 2019-08-25
 **/
@Component
public class BootStrap implements CommandLineRunner
{
    @Autowired
    NotificationException notificationException;

    @Autowired
    EmailService emailService;
    @Override
    public void run(String... args) throws Exception {
//        notificationException.throwException();
        emailService.sendSimpleMessage("adewagold@gmail.com","APPLICATION ERROR", "An Error has occured in line.");
    }
}
