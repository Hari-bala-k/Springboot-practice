package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserControll {
     @Autowired
     @Qualifier("sms") // used for priority to the obj injection
    private Notification notification;

    public void print(){
        notification.printMessage();
    }

}
