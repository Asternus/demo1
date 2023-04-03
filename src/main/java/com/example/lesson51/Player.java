package com.example.lesson51;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Player {

    private Phone phone;
    private int id;
    @Autowired
    public Player(@Qualifier("oldPhone") Phone phone) {
        this.phone = phone;
        this.id = 1;
    }

    public void play(String user) {
        phone.cell(user);
    }
}
