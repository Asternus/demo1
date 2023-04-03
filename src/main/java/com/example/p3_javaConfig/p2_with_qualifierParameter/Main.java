package com.example.p3_javaConfig.p2_with_qualifierParameter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.example.p3_javaConfig");

        Converter converter = applicationContext.getBean(Converter.class);
        converter.convert();

        applicationContext.close();
    }
}
