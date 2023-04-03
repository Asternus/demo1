package com.example.lesson51;

import com.example.p4_properties.DBConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Conf.class);
        final Player player = applicationContext.getBean("player", Player.class);
        player.play("Lisa");
        applicationContext.close();
    }

}
