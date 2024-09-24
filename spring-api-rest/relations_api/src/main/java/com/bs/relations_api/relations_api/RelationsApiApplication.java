package com.bs.relations_api.relations_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing()
public class RelationsApiApplication {
	public static void main(String[] args) {
    
    // 03: 05
		SpringApplication.run(RelationsApiApplication.class, args);
    
	}
}
