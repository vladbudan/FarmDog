package com.leverx.java.dog;

import java.util.Random;

public class Dog {

    private String name;
    private int age;
    private AgeGroup ageGroup;
    private ConditionHealth conditionHealth;
    private ConditionSatiety conditionSatiety;
    private Activity activity;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 ) {
            this.age = 0;
        }
        else if(age > 15) {
            this.age = 15;
        }
        else {
            this.age = age;
        }
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(int age) {
        if(age >= 0 && age <= 2) {
            this.ageGroup = AgeGroup.PUPPY;
        }
        else if(age > 2 && age < 9) {
            this.ageGroup = AgeGroup.ADULT;
        }
        else {
            this.ageGroup = AgeGroup.OLD;
        }
    }

    public ConditionHealth getConditionHealth() {
        return conditionHealth;
    }

    public void setConditionHealth(ConditionHealth conditionHealth) {
        int pick = new Random().nextInt(ConditionHealth.values().length);
        this.conditionHealth = conditionHealth.values()[pick];
    }

    public ConditionSatiety getConditionSatiety() {
        return conditionSatiety;
    }

    public void setConditionSatiety(ConditionSatiety conditionSatiety) {
        int pick = new Random().nextInt(ConditionSatiety.values().length);
        this.conditionSatiety = conditionSatiety.values()[pick];
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void info() {
        System.out.println("Name: " + this.getName() + ", age: " + this.getAge() + ", age group: " +
                this.getAgeGroup() + ", condition of health: " + this.getConditionHealth() + ", condition of satiety: " + this.getConditionSatiety());
    }

}
