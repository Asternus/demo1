package com.example.p3_javaConfig.p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRepository {

    @Autowired
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

}
