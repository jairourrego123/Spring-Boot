package com.atenea.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class AteneaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AteneaApplication.class, args);
	}

}
