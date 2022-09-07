package com.microservice.example.currconversionsrv.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.example.currconversionsrv.controller.domain.CurrencyConversionBean;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CurrConversionController {

    @GetMapping("/currency-converter/from/{fromCurrency}/to/{toCurrency}/amount/{amount}")
    public CurrencyConversionBean getExchangeValue(@PathVariable String fromCurrency,
            @PathVariable String toCurrency,
            @PathVariable BigDecimal amount) {

        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("fromCurrency", fromCurrency);
        uriVariables.put("toCurrency", toCurrency);

        ResponseEntity<CurrencyConversionBean> rEntity = new RestTemplate().getForEntity(
                "http://localhost:8001/currency-exchange/from/{fromCurrency}/to/{toCurrency}",
                CurrencyConversionBean.class, uriVariables);

        CurrencyConversionBean retVal = rEntity.getBody();

        retVal.setAmount(amount);
        retVal.setConvertedAmount(amount.multiply(retVal.getConversionMultiple()));
        return retVal;

    }

}
