package com.neogrid.prequisition;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PrequisitionApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PrequisitionApplication.class);
	}
	
	public static void main(String[] args) throws IOException {
		SpringApplication.run(PrequisitionApplication.class, args);
		System.out.println("Rodou!");
	
	}

}
