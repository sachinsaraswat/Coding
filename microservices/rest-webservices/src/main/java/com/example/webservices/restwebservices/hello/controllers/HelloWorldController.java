package com.example.webservices.restwebservices.hello.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.webservices.restwebservices.hello.domain.HellowWorldBean;

@RestController
public class HelloWorldController {

    // @RequestMapping(path = "/hello-world", method = RequestMethod.GET)
    @GetMapping("/hello-world")
    public String helloWorld() {
        String returnMsg = "Hello World!!123";

        return returnMsg;

    }

    @GetMapping("/hello-world-bean")
    public HellowWorldBean helloWorldBean() {

        return new HellowWorldBean("HelloWorldBean");

    }

    @GetMapping("/hello-world/path-variable/{name}")
    public HellowWorldBean helloWorldBeanPathVariable(@PathVariable String name) {

        return new HellowWorldBean("hello world .." + name);

    }

}
