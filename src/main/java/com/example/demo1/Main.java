package com.example.demo1;

import com.example.demo1.config.Config;
import com.example.demo1.example.Product;
import com.example.demo1.example.ProductService;
import com.example.demo1.example.ProductValidator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.example.demo1.example");

       /*AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Config.class);*/

        ProductService productService = applicationContext.getBean(ProductService.class);

        ProductValidator productValidator = applicationContext.getBean(ProductValidator.class);

        Product product = new Product("Milk");

        productValidator.validateUser(product);
        productService.save(product);

        applicationContext.close();
    }
}
