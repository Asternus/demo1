package com.example.demo1.example;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class ProductValidator {

    public void validateUser(Product product) {
        if (product == null) {
            System.out.println("Product is null");
        }

        String name = Objects.requireNonNullElse(product.getName(), "");

        if (name.isBlank()) {
            System.out.println("Product name is blank");
        }
    }
}
