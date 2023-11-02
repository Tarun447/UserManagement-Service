package com.cap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title = "User management Service",
	description = "User Management Service",
	version = "0.0.1"
		))
public class UserManagementSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementSpringBootApplication.class, args);
	}

}
