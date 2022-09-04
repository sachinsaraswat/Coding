package com.microservice.example.currexchangesrv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class CurrExchangeSrvApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrExchangeSrvApplication.class, args);
	}

}
