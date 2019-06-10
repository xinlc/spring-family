package com.example.reflectDemo;

import com.example.reflectDemo.DI.BeanFactory;
import com.example.reflectDemo.controller.UserController;

import java.util.stream.Stream;

public class DITest {
    public static void main(String[] args) {
//        UserController userController = BeanFactory.getBean(UserController.class);
//        userController.save();
        "abc".matches("[a-z]");

        System.out.println("a|bca|b".replace("a|b", "0"));

        int i = Stream.of("1", "2", "5", "8", "99", "108")
                .map(Integer::valueOf)
                .filter(num -> num < 10)
                .limit(3)
                .reduce(0, (a, b) -> {

                    System.out.println(a +"  " + b);
                   return a + b;
                });

        System.out.println(i);



    }
}
