package org.example.spring_introduction;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("dogBean")
public class Dog implements Pet {

    @Override
    public void say() {
        System.out.println("WOW");
    }

    @PostConstruct
    public void init() {
        System.out.println("Some actions");
    }

    @PreDestroy
    public void delete() {
        System.out.println("Finally end");
    }
}
