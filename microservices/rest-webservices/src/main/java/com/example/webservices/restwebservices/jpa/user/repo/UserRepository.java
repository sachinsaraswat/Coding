package com.example.webservices.restwebservices.jpa.user.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.webservices.restwebservices.user.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
