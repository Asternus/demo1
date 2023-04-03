package com.example.p3_javaConfig.p1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Config {

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }

    @Bean
    public UserService userService() {
        return new UserService(userRepository());
    }

    @Bean
    public List<User> users() {
        User user1 = new User();
        user1.setId(3l);
        user1.setEmail("admin@mail.com");

        User user2 = new User();
        user2.setId(4l);
        user2.setEmail("user@mail.com");

        return List.of(user1, user2);
    }

    @Bean
    public List<User> usersSecondList() {
        User user1 = new User();
        user1.setId(10l);
        user1.setEmail("admin@mail.com");

        User user2 = new User();
        user2.setId(11l);
        user2.setEmail("user@mail.com");

        return List.of(user1, user2);
    }
}

