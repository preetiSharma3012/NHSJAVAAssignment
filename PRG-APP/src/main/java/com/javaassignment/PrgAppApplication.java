package com.javaassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class PrgAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrgAppApplication.class, args);
	}

}
