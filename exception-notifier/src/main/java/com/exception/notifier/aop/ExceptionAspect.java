package com.exception.notifier.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

/**
 * *  Created by Adewale Adeleye on 2019-08-18
 **/
@Configuration
@Aspect
public class ExceptionAspect {
    @AfterThrowing(pointcut = "execution(* com.exception.notifier.*.*.*(..))", throwing = "ex")
    public void logError(Exception ex) {
        System.out.println("\n"+" This is the new Exception +++++++++++++++++ "+ ex.getMessage());
        ex.printStackTrace();
    }

}
