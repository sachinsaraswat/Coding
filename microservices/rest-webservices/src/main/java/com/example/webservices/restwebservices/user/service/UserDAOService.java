package com.example.webservices.restwebservices.user.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.example.webservices.restwebservices.user.domain.User;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserDAOService {

    private List<User> userList = new ArrayList<>();

    private int userCounter;

    @PostConstruct
    private void initList() {
        this.userList.add(new User(1, "Albert", new Date(), null));
        this.userList.add(new User(2, "Bob", new Date(), null));
        this.userList.add(new User(3, "Charlie", new Date(), null));
        userCounter = 3;
    }

    public List<User> findAll() {

        return new ArrayList<User>(this.userList);
    }

    public User save(User user) {
        log.info("Saving.... " + user.toString() + " with id=" + (userCounter + 1));
        user.setId(++userCounter);
        this.userList.add(user);

        return user;
    }

    public User findOne(int id) {

        User retUser = null;
        Optional<User> optUser = this.userList.stream().filter(k -> k.getId() == id).findFirst();

        if (optUser.isPresent()) {
            retUser = optUser.get();
        }

        return retUser;
    }

    public User deleteById(int id) {

        User retUser = findOne(id);

        if (retUser != null) {
            this.userList.removeIf(k -> k.getId() == id);
        }

        return retUser;
    }

}
