package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo5Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Demo5Application.class, args); // For IOC creation

		 WhatsApp notify =context.getBean(WhatsApp.class);//for DI to the notify obj
		 WhatsApp notify1 =context.getBean(WhatsApp.class);
		 notify.printMessage();
		 notify.wpID=22;
		 notify1.printMessage();
		 System.out.println(notify.wpID +" : " + notify1.wpID);
	}

}
