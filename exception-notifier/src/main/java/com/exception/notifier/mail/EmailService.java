package com.exception.notifier.mail;

/**
 * *  Created by Adewale Adeleye on 2019-08-25
 **/
public interface EmailService {
    void sendSimpleMessage(String to, String subject, String text);
}
