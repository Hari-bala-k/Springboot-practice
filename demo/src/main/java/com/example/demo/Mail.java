package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



public class Mail implements Notification{
    public void printMessage() {
        System.out.println("hey!! from Mail");
    }
}
