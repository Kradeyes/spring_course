package org.example.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    /*
    @Autowired
     */
    private Pet pet;
    private String surname;
    private int age;

    /*
     @Autowired
     public Person(Pet pet) {
        this.pet = pet;
    }
     */


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /*
    @Autowired
     */
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my Pet!");
        pet.say();
    }
}
