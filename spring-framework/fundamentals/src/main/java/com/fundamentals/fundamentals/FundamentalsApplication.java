package com.fundamentals.fundamentals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Crear el .jar o el build de npm en spring => ./mvnw clean package
// Entrar a target con cd ./target
// Seleccionar el archivo .jar => java -jar ./fundamentals-0.0.1-SNAPSHOT.jar

@SpringBootApplication
public class FundamentalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundamentalsApplication.class, args);
	}

}
