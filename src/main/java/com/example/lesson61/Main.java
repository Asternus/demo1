package com.example.lesson61;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(FastFoodConfig.class);
        final Restaurant burger = applicationContext.getBean("burger", Burger.class);
        final Burger fastFood = applicationContext.getBean("burger", Burger.class);

        final Market market = applicationContext.getBean("market", Market.class);
        market.sell();

        final String name = fastFood.getName();
        System.out.println(name);

    }

}
