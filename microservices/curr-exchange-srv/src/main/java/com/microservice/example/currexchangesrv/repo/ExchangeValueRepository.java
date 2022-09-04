package com.microservice.example.currexchangesrv.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.example.currexchangesrv.domain.ExchangeValue;

@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
    public ExchangeValue findByFromCurrencyAndToCurrency(String fromCurrency, String toCurrency);

}

// 131 Step 17 - Create a JPA repository