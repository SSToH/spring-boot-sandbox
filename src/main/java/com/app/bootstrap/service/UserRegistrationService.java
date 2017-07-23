package com.app.bootstrap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.bootstrap.entity.User;
import com.app.bootstrap.repository.UserRepository;

/**
 * User Registration Service.
 */
@Service
@Transactional
public class UserRegistrationService {

    @Autowired
    UserRepository userRepository;

    /**
     * save user
     *
     * @param user User
     * @return User
     */
    public User save(User user) {
        return userRepository.save(user);
    }

    /**
     * find all user
     *
     * @return List<User>
     */
    public List<User> findAll() {
        return userRepository.findAll();
    }

    /**
     * find user
     *
     * @param id userId
     * @return User
     */
    public User findOne(Integer id) {
        return userRepository.findOne(id);
    }

    /**
     * create user
     *
     * @param user User
     * @return User
     */
    public User create(User user) {
        return userRepository.save(user);
    }

    /**
     * update User
     *
     * @param user User
     * @return User
     */
    public User update(User user) {
        return userRepository.save(user);
    }

    /**
     * delete user
     *
     * @param id userId
     */
    public void delete(Integer id) {
        userRepository.delete(id);
    }
}
