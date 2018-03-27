package com.springbootrecipes.springbootrecipes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages={"com.springbootrecipes.controllers"})
public class SpringbootRecipesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRecipesApplication.class, args);
	}
}
