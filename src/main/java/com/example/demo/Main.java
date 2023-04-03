package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("example.xml");

     /*   ApplicationContext context = new ClassPathXmlApplicationContext(
                "example.xml");*/

   /*     final Student student = (Student) applicationContext.getBean("student");

        System.out.println(student.getName());*/

        LifecycleBean lifecycleBean = applicationContext.getBean("lifecycleBean", LifecycleBean.class);

        System.out.println("lifecycleBean = " + lifecycleBean);

        applicationContext.close();

    }
}
