package org.it.discovery.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication {
	public static void main(String[] args) {
		// http://localhost:7777/hello/dasha
		SpringApplication.run(ServerApplication.class, 
				args);
	}
}