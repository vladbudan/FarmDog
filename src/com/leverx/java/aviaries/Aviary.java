package com.leverx.java.aviaries;

import java.util.Random;

public class Aviary {

    private int number;
    private ConditionAviary conditionAviary;

    public Aviary(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ConditionAviary getConditionAviary() {
        return conditionAviary;
    }

    public void setConditionAviary(ConditionAviary conditionAviary) {
        int pick = new Random().nextInt(ConditionAviary.values().length);
        this.conditionAviary = conditionAviary.values()[pick];
    }

    public void info() {
        System.out.println("Aviary number: " + this.getNumber() +  ", aviary condition: " + this.getConditionAviary());
    }
}
