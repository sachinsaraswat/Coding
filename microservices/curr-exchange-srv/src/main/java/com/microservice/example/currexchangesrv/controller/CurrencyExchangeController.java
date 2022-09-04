package com.microservice.example.currexchangesrv.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.example.currexchangesrv.domain.ExchangeValue;
import com.microservice.example.currexchangesrv.repo.ExchangeValueRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CurrencyExchangeController {

    @Autowired
    Environment environment;

    @Autowired
    ExchangeValueRepository repository;

    @GetMapping("/currency-exchange/from/{fromCurrency}/to/{toCurrency}")
    public ExchangeValue getExchangeValue(@PathVariable String fromCurrency, @PathVariable String toCurrency) {

        log.info("From: " + fromCurrency + ", To:" + toCurrency);

        // ExchangeValue retExchangeValue = new ExchangeValue(100L, fromCurrency,
        // toCurrency, BigDecimal.valueOf(78), 10);
        ExchangeValue retExchangeValue = repository.findByFromCurrencyAndToCurrency(fromCurrency, toCurrency);
        retExchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));

        return retExchangeValue;

    }

}
