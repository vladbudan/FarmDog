package com.leverx.java.person;

import com.leverx.java.dog.ConditionHealth;
import com.leverx.java.dog.Dog;

import java.util.List;

public class Vet extends Person {

    private String name;

    public Vet(String name) {
        this.name = name;
    }

    @Override
    public void check(List<Dog> dogs) {
        for(Dog dog: dogs) {
            switch (dog.getConditionHealth()) {
                case ILL: {
                    System.out.println("Ill dogs: " + dog.getName());
                    break;
                }
            }
        }
    }

    @Override
    public void heal(List<Dog> dogs) {
        for(Dog dog: dogs) {
            switch (dog.getConditionHealth()) {
                case ILL: {
                    System.out.println("Healing of dog with name: " + dog.getName());
                    dog.setConditionHealth(ConditionHealth.HEALTHY);
                    break;
                }
            }
        }
    }

}
