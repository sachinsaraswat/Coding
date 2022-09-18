package com.microservice.example.currconversionsrv.controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.example.currconversionsrv.controller.domain.CurrencyConversionBean;

//netflix-api-gateway
//@FeignClient(name = "currency-exchange-service", url = "localhost:8001")
//@FeignClient(name = "currency-exchange-service")
@FeignClient(name = "netflix-api-gateway")

@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchangeServiceProxy {

    // @GetMapping("/currency-exchange/from/{fromCurrency}/to/{toCurrency}")
    @GetMapping("/currency-exchange-service/currency-exchange/from/{fromCurrency}/to/{toCurrency}")
    public CurrencyConversionBean getExchangeValueN(@PathVariable String fromCurrency, @PathVariable String toCurrency);

}
