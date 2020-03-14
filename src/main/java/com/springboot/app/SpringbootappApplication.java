package com.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootappApplication.class, args);
	}
}
