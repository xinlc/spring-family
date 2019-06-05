package com.example.reflectDemo;

import com.example.reflectDemo.DI.BeanFactory;
import com.example.reflectDemo.controller.UserController;

public class DITest {
    public static void main(String[] args) {
        UserController userController = BeanFactory.getBean(UserController.class);
        userController.save();
    }
}
