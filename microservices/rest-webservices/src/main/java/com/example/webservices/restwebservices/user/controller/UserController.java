package com.example.webservices.restwebservices.user.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.webservices.restwebservices.user.domain.User;
import com.example.webservices.restwebservices.user.exception.UserNotFoundException;
import com.example.webservices.restwebservices.user.service.UserDAOService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserDAOService userDAOService;

    private String getUserURI = "/user";

    // /GET /users

    // @RequestMapping(value = "/users", method = RequestMethod.GET, produces = {
    // "application/xml", "application/json" } )

    @GetMapping(path = "/users")
    public List<User> getAllUSers() {
        return this.userDAOService.findAll();
    }

    // /GEt /user/{id}

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable int id) {

        User retUser = userDAOService.findOne(id);
        if (retUser == null) {

            throw new UserNotFoundException("id = " + id);

        }

        // log.info(retUser.toString());

        return retUser;
    }

    @PostMapping("/add-user")
    public ResponseEntity<Object> addUser(@Validated @RequestBody User inputUser) {

        User retUser = this.userDAOService.save(inputUser);
        URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path(getUserURI + "/{id}")
                .buildAndExpand(retUser.getId()).toUri();

        log.info("Location::" + location);

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/delete-user/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable int id) {
        log.info("Before--");

        User retUser = this.userDAOService.deleteById(id);
        log.info("after--");

        URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path(getUserURI + "/{id}")
                .buildAndExpand(id).toUri();

        if (retUser == null) {

            throw new UserNotFoundException("id = " + id);

        }

        return new ResponseEntity<>(location, HttpStatus.ACCEPTED);
    }

}
