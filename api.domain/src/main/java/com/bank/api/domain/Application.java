package com.bank.api.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("Start Excecuting...");
		SpringApplication.run(Application.class, args);
		System.out.println("Finish Excecuting...");

	}

}
