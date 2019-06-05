package com.example.reflectDemo.controller;

import com.example.reflectDemo.DI.Inject;
import com.example.reflectDemo.service.UserService;

public class UserController {

    public UserController() {

    }

    @Inject
    private UserService userService;

    public void save() {
        userService.save();
    }
}

