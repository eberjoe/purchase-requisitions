package com.neogrid.prequisition;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrequisitionApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(PrequisitionApplication.class, args);
		System.out.println("Rodou!");
	
	}

}
