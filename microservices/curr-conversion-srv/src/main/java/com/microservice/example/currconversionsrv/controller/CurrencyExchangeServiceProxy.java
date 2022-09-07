package com.microservice.example.currconversionsrv.controller;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "currency-exchange-service", url = "localhost:8001")
public interface CurrencyExchangeServiceProxy {

}
