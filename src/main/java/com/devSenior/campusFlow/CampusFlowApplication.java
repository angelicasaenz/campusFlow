package com.devSenior.campusFlow;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
		"com.devSenior.campusFlow",
		"com.devsenior.campusflow"
})
@EntityScan("com.devsenior.campusflow.usuarios.model")
@EnableJpaRepositories("com.devsenior.campusflow.usuarios.repository")
public class CampusFlowApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampusFlowApplication.class, args);
	}

}
