package com.leverx.java.person;

import com.leverx.java.aviaries.ConditionAviary;
import com.leverx.java.aviaries.Aviary;
import com.leverx.java.dog.Activity;
import com.leverx.java.dog.Dog;

import java.util.List;

import static com.leverx.java.person.Meal.*;

public class Staff extends Person {

    private String name;
    private Meal meal;

    public Staff(String name) {
        this.name = name;
    }

    @Override
    public void feed(List<Dog> dogs) {
        for(Dog dog: dogs) {
            switch (dog.getAgeGroup()) {
                case PUPPY: {
                    System.out.println(dog.getName() + " gets " + PUPPY_MEAL);
                    break;
                }
                case ADULT: {
                    System.out.println(dog.getName() + " gets " + ADULT_MEAL);
                    break;
                }
                case OLD: {
                    System.out.println(dog.getName() + " gets " + OLD_MEAL);
                    break;
                }
            }
        }
    }

    @Override
    public void clear(List<Aviary> aviaries) {
        for(Aviary aviary: aviaries) {
            switch (aviary.getConditionAviary()) {
                case DIRTY: {
                    System.out.println("Dirty aviaries: " + aviary.getNumber());
                    aviary.setConditionAviary(ConditionAviary.CLEAN);
                    break;
                }
            }
        }
    }

    @Override
    public void train(List<Dog> dogs) {
        for(Dog dog: dogs) {
            switch (dog.getAgeGroup()) {
                case PUPPY: {
                    dog.setActivity(Activity.TRAIN);
                    System.out.println("Puppy dog: " + dog.getName() + ", activity: " + dog.getActivity());
                    break;
                }
                case ADULT: {
                    dog.setActivity(Activity.WORK);
                    System.out.println("Adult dog: " + dog.getName() + ", activity: " + dog.getActivity());
                    break;
                }
                case OLD: {
                    dog.setActivity(Activity.RELAX);
                    System.out.println("Old dog: " + dog.getName() + ", activity: " + dog.getActivity());
                    break;
                }
            }
        }
    }

}
