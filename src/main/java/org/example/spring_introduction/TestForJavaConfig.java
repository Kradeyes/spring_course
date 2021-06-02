package org.example.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestForJavaConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person =  context.getBean("personBean", Person.class);
        person.callYourPet();
    }
}
