package com.example.p3_javaConfig.p1;

import java.util.List;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findALl() {
        return userRepository.getUsers();
    }

}





