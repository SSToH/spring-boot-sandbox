package com.app.bootstrap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.bootstrap.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
