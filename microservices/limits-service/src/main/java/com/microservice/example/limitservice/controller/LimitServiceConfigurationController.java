package com.microservice.example.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.example.limitservice.config.ConfigurationPropertyStore;
import com.microservice.example.limitservice.domain.LimitConfiguration;

@RestController
public class LimitServiceConfigurationController {

    @Autowired
    ConfigurationPropertyStore configProperties;

    @GetMapping("/limits-static")
    public LimitConfiguration getLimits() {
        return new LimitConfiguration(1, 1000);
    }

    @GetMapping("/limits")
    public LimitConfiguration getLimitsConfiguration() {
        return new LimitConfiguration(this.configProperties.getMinimum(), this.configProperties.getMaximum());
    }

}
