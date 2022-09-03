package com.example.webservices.restwebservices.filter.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webservices.restwebservices.filter.domain.User;

@RestController
public class RestFilterController {

    private List<User> userList = new ArrayList<>();

    private int userCounter;

    @PostConstruct
    private void initList() {
        this.userList.add(new User(1, "Albert", new Date()));
        this.userList.add(new User(2, "Bob", new Date()));
        this.userList.add(new User(3, "Charlie", new Date()));
        userCounter = 3;
    }

    @GetMapping(path = "/users-filter")
    public List<User> getAllUSers() {
        return this.userList;

    }

}
