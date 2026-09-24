package com.devSenior.campusFlow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.devSenior.campusFlow")
@SpringBootApplication
public class CampusFlowApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampusFlowApplication.class, args);
	}

}
