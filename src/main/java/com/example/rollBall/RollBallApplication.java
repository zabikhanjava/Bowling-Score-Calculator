package com.example.rollBall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class RollBallApplication {

	@GetMapping


	public static void main(String[] args) {
		SpringApplication.run(RollBallApplication.class, args);
	}

}
