package com.example.simp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("example.xml");

     /*   final Music popMusic1 = (Music) applicationContext.getBean("popMusic1");*/

        final Player player = applicationContext.getBean("player", Player.class);
        player.play();

    }

}
