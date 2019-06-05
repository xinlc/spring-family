package com.example.reflectDemo;

import com.example.reflectDemo.DI.Autowired;

public class Demo {
    private String str;

    @Autowired
    public void setStr (String str) {
        this.str = str;
    }

    public String getStr () {
        return str;
    }
}
