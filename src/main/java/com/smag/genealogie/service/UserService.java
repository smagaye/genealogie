package com.smag.genealogie.service;

import com.smag.genealogie.model.User;
import com.smag.genealogie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Collection<User> getAll() {
        return userRepository.getAllUsers();
    }
}
