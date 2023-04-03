package com.example.lesson51;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.lesson51")
@PropertySource("classpath:lesson.properties")
public class Conf {
}
