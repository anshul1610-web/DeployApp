package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaAppApplication.class, args);
		System.out.println("Start Application");
		System.out.println("Start Application");
		System.out.println("Start Application");
		
	}
	
	@GetMapping("/home")
	public String get() {
		return "Hello Java App from sts";
	}

}
