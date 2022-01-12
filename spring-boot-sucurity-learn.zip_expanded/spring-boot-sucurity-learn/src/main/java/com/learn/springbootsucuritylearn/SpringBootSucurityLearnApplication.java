package com.learn.springbootsucuritylearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class SpringBootSucurityLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSucurityLearnApplication.class, args);
	}

}
