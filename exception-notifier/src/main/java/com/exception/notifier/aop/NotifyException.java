package com.exception.notifier.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * *  Created by Adewale Adeleye on 2019-08-18
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NotifyException {
    boolean email() default true;
    boolean sms() default false;
    boolean slack();
}

class TestAnnotation{
    @NotifyException(email = true,sms = false, slack = false)
    public void test(){
        System.out.println("Access data");
    }
}

class RunAnnotation{
    public static void main(String[] args) throws NoSuchMethodException {
        TestAnnotation t = new TestAnnotation();
        Method m  = t.getClass().getMethod("test");
        NotifyException n = m.getAnnotation(NotifyException.class);
        System.out.println("Email is : "+n.email() +"\n");
        System.out.println("SMS is : "+n.sms() +"\n");
        System.out.println("Slack is : "+n.slack() +"\n");
    }
}
