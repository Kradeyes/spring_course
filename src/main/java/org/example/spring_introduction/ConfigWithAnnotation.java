package org.example.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation {
    public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext1.xml");

    Person person = context.getBean("personBean", Person.class);
    person.callYourPet();
    /*
    Cat myCat =context.getBean("catBean", Cat.class);
    Если мы не задаем id бину в аннотации Component, то
    Cat myCat =context.getBean("cat", Cat.class);
    myCat.say();
     */
   }
}
