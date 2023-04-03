package com.example.lesson61;

import org.springframework.stereotype.Component;

@Component
public class NiceFood implements Restaurant{
    @Override
    public int getPrice() {
        return 20;
    }
}
