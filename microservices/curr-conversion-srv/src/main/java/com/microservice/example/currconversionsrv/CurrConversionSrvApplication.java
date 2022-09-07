package com.microservice.example.currconversionsrv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.microservice.example.currconversionsrv")
public class CurrConversionSrvApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrConversionSrvApplication.class, args);
	}

}
