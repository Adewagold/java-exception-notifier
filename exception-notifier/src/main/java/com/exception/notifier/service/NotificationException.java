package com.exception.notifier.service;

import org.springframework.stereotype.Service;

/**
 * *  Created by Adewale Adeleye on 2019-08-18
 **/
@Service
public class NotificationException {
    public void throwException() throws Exception {
        throw new Exception("This is the very first Exception");
    }
}
