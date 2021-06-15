package com.leverx.java;

import com.leverx.java.aviaries.Aviary;
import com.leverx.java.dog.Dog;
import com.leverx.java.person.Staff;
import com.leverx.java.person.Vet;
import java.util.ArrayList;
import java.util.List;

public class FarmDog {

    public static void main(String[] args) {

//        FarmDog farmDog = new FarmDog();
//        farmDog.createDog();

        Vet vet = new Vet("Max");
        Staff staff = new Staff("Sofia");

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Rick", 1));
        dogs.add(new Dog("Rey", 4));
        dogs.add(new Dog("Tyson", 10));

        List<Aviary> aviaries = new ArrayList<>();
        aviaries.add(new Aviary(1));
        aviaries.add(new Aviary(2));
        aviaries.add(new Aviary(3));

        System.out.println("\nAll existing aviaries: ");
        getAviaries(aviaries);

        System.out.println("\nAll existing dogs: ");
        getAllDogs(dogs);

        System.out.println("\nMorning feeding of dogs...");
        staff.feed(dogs);

        System.out.println("\nChecking of dogs...");
        vet.check(dogs);

        System.out.println("\nHealing of dogs...");
        vet.heal(dogs);
        System.out.println("All dogs are healthy!");

        System.out.println("\nCleaning of aviaries...");
        staff.clear(aviaries);
        System.out.println("all aviaries are cleared");

        System.out.println("\nDistribute dogs to responsibilities: ");
        staff.train(dogs);

        System.out.println("\nEvening feeding of dogs...");
        staff.feed(dogs);

    }

//    public static void createDog() {
//        List<Dog> dogs = new ArrayList<>();
//        dogs.add(new Dog("Rick", 1));
//        dogs.add(new Dog("Rey", 4));
//        dogs.add(new Dog("Tyson", 10));
//    }

    public static void getAllDogs(List<Dog> dogs) {
        for(Dog dog: dogs) {
            dog.setAgeGroup(dog.getAge());
            dog.setConditionHealth(dog.getConditionHealth());
            dog.setConditionSatiety(dog.getConditionSatiety());
            dog.info();
        }
    }

    public static void getAviaries(List<Aviary> aviaries) {
        for(Aviary aviary: aviaries) {
            aviary.setConditionAviary(aviary.getConditionAviary());
            aviary.info();
        }
    }

}


