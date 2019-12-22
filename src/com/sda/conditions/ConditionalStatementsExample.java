package com.sda.conditions;

import java.util.Scanner;

public class ConditionalStatementsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int x = scanner.nextInt();

        recognizeNumber(x);
        dayOfTheWeek(x);
    }

    static void dayOfTheWeek(int x) {
        switch (x){
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("WRONG NUMBER");
        }
    }

    static void recognizeNumber(int x){
        if(x==1){
            System.out.println("X equals 1!");
        } else if (x==2) {
            System.out.println("X equals 2!");
        } else {
            System.out.println("X equals something else!");
        }
    }
}
