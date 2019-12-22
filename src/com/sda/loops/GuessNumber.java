package com.sda.loops;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int playAgain = 1;
        do {
            loadGame();
            System.out.println("Type 0 to finish.");
            playAgain = loadNumber();
        } while(playAgain!=0);
    }

    static int generateNumber(){
        System.out.println("Number generation...");
        return new Random().nextInt(10);
    }

    static int loadNumber(){
        System.out.print("? ");
        return scanner.nextInt();
    }

    static void loadGame(){
        int randomNumber = generateNumber();
        int loaded = loadNumber();
        while(loaded!=randomNumber){
            System.out.println("Number too " + (loaded>randomNumber? "high" : "low"));
            loaded = loadNumber();
        }
        System.out.println("Success!");
    }
}
