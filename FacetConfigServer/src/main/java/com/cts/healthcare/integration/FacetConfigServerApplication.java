package com.cts.healthcare.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class FacetConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacetConfigServerApplication.class, args);
	}
}
