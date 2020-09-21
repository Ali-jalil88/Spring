package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		SpringApplication.run(Address.class, args);
		SpringApplication.run(Employee.class, args);
		SpringApplication.run(Answer.class, args);
		SpringApplication.run(Question.class, args);
		SpringApplication.run(Student.class, args);

	}
}
