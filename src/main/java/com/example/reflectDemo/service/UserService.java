package com.example.reflectDemo.service;

import com.example.reflectDemo.DI.Inject;
import com.example.reflectDemo.dao.UserDao;

public class UserService {

    public UserService() {

    }

    @Inject
    private UserDao userDao;

    public void save() {
        userDao.save();
    }
}
