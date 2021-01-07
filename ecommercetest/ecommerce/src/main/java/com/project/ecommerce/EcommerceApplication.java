//Created by Vincenzo Di Marco
package com.project.ecommerce;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.stream.Stream;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}


	@Bean
	ApplicationRunner init(User repository) {

		return args -> {
			Stream.of(new User(1, "Mario", "Rossi", "01/12/2012"),
					new User(2, "Paolo", "Bianchi", "10/02/2003"),
					new User(3, "Giulio", "Gialli", "20/11/1999")).forEach(user -> {
				repository.save(user);
			});

			repository.findAll().forEach(System.out::println);
		};
	}
}
