package com.example.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestProjectApplication {

	public static Logger logger =LoggerFactory.getLogger(TestProjectApplication.class);
	
	@PostConstruct
	public void init() { 
		System.out.println("JENKINS TESTING");
		logger.info("Application Started");
		
	}
	public static void main(String[] args) {
		logger.info("Application Executed");
		SpringApplication.run(TestProjectApplication.class, args);
	}

}
