package com.microservice.example.limitservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ConfigurationProperties("limits-service")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ConfigurationPropertyStore {
    private int minimum;
    private int maximum;

}
