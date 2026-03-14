package com.example.demo;

import org.springframework.stereotype.Component;


public class Sms implements Notification{
    public void printMessage(){
        System.out.println("Heyy!! from Sms");
    }
}
