package com.example.webservices.restwebservices.jpa.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.webservices.restwebservices.user.domain.Post;

@Repository
public interface PostsRepository extends JpaRepository<Post, Integer> {

}
