package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.persistence.mapper.ProductMapper"})
public class SpringPlatziApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPlatziApplication.class, args);
	}

}
