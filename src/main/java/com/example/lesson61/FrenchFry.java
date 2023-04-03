package com.example.lesson61;

import org.springframework.stereotype.Component;

@Component
public class FrenchFry implements FastFood {
    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void setId(int id) {
        id = 1;
    }

    @Override
    public String getName() {
        return "FreshFry";
    }

}
