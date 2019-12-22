package com.sda.conditions;

import java.util.Scanner;

public class EvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number = scanner.nextInt();

        checkIf(number);
        checkIfElse(number);
    }

    static void checkIf(int x){
        System.out.println("Check with ifs.");
        if(x%2==0){
            System.out.println("EVEN");
        }
        if(x%2!=0){
            System.out.println("ODD");
        }
    }

    static void checkIfElse(int x){
        System.out.println("Check with if else.");
        if(x%2==0){
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}
