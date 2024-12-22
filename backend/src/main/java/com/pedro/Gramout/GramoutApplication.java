package com.pedro.Gramout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com.pedro.Gramout.entity")
@SpringBootApplication
public class GramoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(GramoutApplication.class, args);
	}

}
