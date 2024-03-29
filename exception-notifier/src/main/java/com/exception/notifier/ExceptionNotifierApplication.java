package com.exception.notifier;

import com.exception.notifier.service.NotificationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExceptionNotifierApplication implements CommandLineRunner
{
	@Autowired
	NotificationException notificationException;

	public static void main(String[] args) {
		SpringApplication.run(ExceptionNotifierApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	notificationException.throwException();
	}
}
