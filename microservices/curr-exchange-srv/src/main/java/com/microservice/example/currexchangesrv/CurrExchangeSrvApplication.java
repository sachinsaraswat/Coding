package com.microservice.example.currexchangesrv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
public class CurrExchangeSrvApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrExchangeSrvApplication.class, args);
	}

	@Bean
	public Sampler sampler() {
		return Sampler.ALWAYS_SAMPLE;

	}

}
