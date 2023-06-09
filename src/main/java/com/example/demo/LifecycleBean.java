package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifecycleBean implements InitializingBean, DisposableBean {

    @PostConstruct
    public void postConstruct() {
        System.out.println("Post Construct stage");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("After Properties Set stage");
    }

    public void customInit() {
        System.out.println("Custom Init stage");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Pre Destroy stage");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy stage");
    }

    public void customDestroy() {
        System.out.println("Custom Destroy stage");
    }

    @Override
    public String toString() {
        return "LifecycleBean{}";
    }
}
