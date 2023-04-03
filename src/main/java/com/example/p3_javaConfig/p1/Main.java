package com.example.p3_javaConfig.p1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Config.class);

        UserService userService = applicationContext.getBean(UserService.class);

        List<User> users = userService.findALl();
        users.forEach(System.out::println);

        applicationContext.close();
    }
}
