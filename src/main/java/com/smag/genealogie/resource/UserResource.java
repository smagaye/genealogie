package com.smag.genealogie.resource;


import com.smag.genealogie.model.User;
import com.smag.genealogie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/rest/allUsers")
public class UserResource {

    @Autowired
    UserService userService;


    @GetMapping
    public Collection<User> getAll() {
        return userService.getAll();
    }

}
