package com.Movie.MicroServices;
import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.mongodb.*;
import com.mongodb.client.MongoDatabase;

@SpringBootApplication
public class MicroServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesApplication.class, args);
	}
   @Bean
   public RestTemplate restTemplate()
   {
	   return new RestTemplate();
   }
}
