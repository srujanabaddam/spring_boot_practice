package com.cah.spring.web.practice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.cah.spring.web.practise1","com.cash.service.practise1"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
