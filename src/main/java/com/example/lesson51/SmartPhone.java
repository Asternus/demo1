package com.example.lesson51;

import org.springframework.stereotype.Component;

@Component
public class SmartPhone implements Phone {
    @Override
    public void cell(String user) {
        System.out.println(user + " video cell");
    }
}
