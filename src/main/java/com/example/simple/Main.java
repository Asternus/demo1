package com.example.simple;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("example.xml");

        final Animal cat = (Animal) applicationContext.getBean("cat");

        final Animal cat1 = (Animal) applicationContext.getBean("cat");

        final Utils utils1 = (Utils) applicationContext.getBean("utils");

       /* utils.hello();*/

        utils1.hello();

        cat.setName("cat1");

        System.out.println(cat1.getName());

    }

}
