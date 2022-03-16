package com.example.Rest.consuming.Rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestApplication {
    @Bean
      public RestTemplate getRestTamplate() {
      return new RestTemplate();
    
      }
	public static void main(String[] args) {
		SpringApplication.run(ConsumingRest.class, args);
	}

}
