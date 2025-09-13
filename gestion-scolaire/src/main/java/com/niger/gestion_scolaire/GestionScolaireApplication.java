package com.niger.gestion_scolaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GestionScolaireApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionScolaireApplication.class, args);
		System.out.println("Hello");
	}

}
