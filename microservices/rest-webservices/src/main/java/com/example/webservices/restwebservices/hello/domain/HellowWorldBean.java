package com.example.webservices.restwebservices.hello.domain;

import lombok.Data;

@Data
public class HellowWorldBean {

    private String message;

    public HellowWorldBean(String msg) {

        this.message = msg;
    }

}
