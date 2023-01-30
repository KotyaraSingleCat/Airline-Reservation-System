package com.airline.reservation.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class AirPlusApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirPlusApplication.class, args);
	}

}
