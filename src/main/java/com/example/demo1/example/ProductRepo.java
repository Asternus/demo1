package com.example.demo1.example;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepo {
    public void save(Product product){
        System.out.println("Product " + product.getName() + " was saved");
    }
}
