package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserControll {
     WhatsApp wp;
    @Autowired //used for injection to the wp reference
    public UserControll(WhatsApp wp) {
        this.wp = wp;
    }

    public void print(){
        System.out.println(wp.show());
    }

}
