package com.example.lesson61;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Market {

    private FastFood fastFood;

    @Autowired
    public Market(@Qualifier("burger") FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public void sell() {
        System.out.println("i sell this " + fastFood);
    }

}
