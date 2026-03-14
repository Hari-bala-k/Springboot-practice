package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo5Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Demo5Application.class, args); // For IOC creation

		 UserControll user =context.getBean(UserControll.class);//for DI to the notify obj
		 user.print();



	}

}
