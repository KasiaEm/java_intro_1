package com.sda.statnonstat;

public class HorseManager {
    public static void main(String[] args) {
        Horse.horseType(); //mammal

        Horse h1 = new Horse();
        //h1.setSmallCaseName(Horse.horseRandomName());
        //h1.printName(); //Henryk
        System.out.println(h1.getName());
        h1.setName("Bartek");
        System.out.println(h1.getName());
    }
}
