package com.microservice.example.currexchangesrv.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ExchangeValue {

    @Id
    private Long id;
    private String fromCurrency;
    private String toCurrency;
    private BigDecimal conversionMultiple;

    private int port;

}
