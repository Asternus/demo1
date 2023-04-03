package com.example.lesson61;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Burger implements FastFood, Restaurant {

    private int id;

    @Value("${burger.name}")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
