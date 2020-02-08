package com.sda.statnonstat;

import java.util.Random;

public class Horse {
    static String typ = "mammal";

    private String name;
    private double weight;

    void printName(){
        System.out.println("My name is: " + name);
    }

    static String horseRandomName(){
        String[] names = new String[]{"Henryk", "Damian", "Olgierd"};
        return names[new Random().nextInt(names.length-1)];
    }

    static void horseType() {
        System.out.println("Horse is type of: " + typ);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase()+ "!";
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
