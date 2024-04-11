package com.ex.notice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class CosmeticProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CosmeticProjectApplication.class, args);
	}

}
