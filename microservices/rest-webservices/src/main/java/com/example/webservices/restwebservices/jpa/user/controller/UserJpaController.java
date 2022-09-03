package com.example.webservices.restwebservices.jpa.user.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.webservices.restwebservices.jpa.user.repo.PostsRepository;
import com.example.webservices.restwebservices.jpa.user.repo.UserRepository;
import com.example.webservices.restwebservices.user.domain.Post;
import com.example.webservices.restwebservices.user.domain.User;
import com.example.webservices.restwebservices.user.exception.UserNotFoundException;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserJpaController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PostsRepository postsRepository;

    private String getUserURI = "/user";

    // /GET /users

    // @RequestMapping(value = "/users", method = RequestMethod.GET, produces = {
    // "application/xml", "application/json" } )

    @GetMapping(path = "/jpa/users")
    public List<User> getAllUSers() {
        return this.userRepository.findAll();
    }

    @GetMapping(path = "/jpa/user/{userId}/posts")
    public List<Post> getUserPosts(@PathVariable int userId) {

        List<Post> returnList = null;

        Optional<User> userOptional = this.userRepository.findById(userId);

        if (!userOptional.isPresent()) {

            throw new UserNotFoundException("id = " + userId);
        } else {
            returnList = userOptional.get().getPosts();
        }

        return returnList;

    }

}
