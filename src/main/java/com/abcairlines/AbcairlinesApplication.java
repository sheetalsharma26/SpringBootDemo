package com.abcairlines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.abcairlines.repository")
@SpringBootApplication
public class AbcairlinesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbcairlinesApplication.class, args);
	}

}
