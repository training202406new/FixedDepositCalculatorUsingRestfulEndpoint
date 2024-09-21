package com.example.FixedDepositCalculatorUsingRestfulEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FixedDepositCalculatorUsingRestfulEndpointApplication {

	@Autowired
	FixedDepositController fixedDepositController;

	public static void main(String[] args) {
		SpringApplication.run(FixedDepositCalculatorUsingRestfulEndpointApplication.class, args);
	}
}

