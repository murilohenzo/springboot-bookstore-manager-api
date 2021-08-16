package com.murilohenzo.bookstoremanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.murilohenzo.bookstoremanager.entities"})
@EnableJpaRepositories(basePackages = {"com.murilohenzo.bookstoremanager.repositories"})
@ComponentScan(basePackages =
		{
				"com.murilohenzo.bookstoremanager.services",
				"com.murilohenzo.bookstoremanager.controllers",
				"com.murilohenzo.bookstoremanager.dtos",
				"com.murilohenzo.bookstoremanager.mappers",
				"com.murilohenzo.bookstoremanager.exceptions",
				"com.murilohenzo.bookstoremanager.utils"
		})
@EnableJpaAuditing
@SpringBootApplication
public class BookstoremanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoremanagerApplication.class, args);
	}

}
