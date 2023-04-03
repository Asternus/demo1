package com.example.lesson51;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OldPhone implements Phone {
    @Value("${oldPhone.name}")
    String name;

    @Override
    public void cell(String user) {
        System.out.println(user + " cell " + name);
    }
}
