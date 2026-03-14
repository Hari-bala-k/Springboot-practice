package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") // for achieving different obj creation for same class
public class WhatsApp implements Notification{

    public void printMessage(){
        System.out.println("Hey!! From Wp");
    }

     public String show(){
        return "hello from wp";
     }
}
