package com.freelancer.microservice.gestionpropositionsprojet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@CrossOrigin("*")
@EnableEurekaClient
@SpringBootApplication
public class GestionPropositionsProjetApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionPropositionsProjetApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {

			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("GET", "DELETE", "POST", "PUT", "OPTIONS").allowedHeaders("*")
						.allowedOrigins("*");

			}
		};
	}
}