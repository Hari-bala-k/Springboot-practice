package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Sms implements Notification{

    public void printMessage(){
        System.out.println("Heyy!! from Sms");
    }
}
