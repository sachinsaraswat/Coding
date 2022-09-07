package com.microservice.example.currconversionsrv.controller.domain;

import java.math.BigDecimal;
import java.util.Formatter.BigDecimalLayoutForm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CurrencyConversionBean {

    private Long id;
    private String fromCurrency;
    private String toCurrency;

    private BigDecimal conversionMultiple;
    private int port;
    private BigDecimal amount;
    private BigDecimal convertedAmount;

}
