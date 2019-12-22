package com.sda.conditions;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        drawMenu();
        int choice = loadNumber();
        int result;
        switch (choice) {
            case 1:
                System.out.println("---ADD");
                result = add(loadNumber(), loadNumber());
                break;
            case 2:
                System.out.println("---ABS");
                result = abs(loadNumber());
                break;
            case 3:
                System.out.println("---MAX");
                result = max(loadNumber(), loadNumber(), loadNumber());
                break;
            case 4:
                System.out.println("---SIGN CHANGE");
                result = signChange(loadNumber());
                break;
            default:
                System.out.println("WRONG CHOICE");
                result = 0;
        }
        System.out.print("RESULT: " + result);
    }

    static void drawMenu() {
        System.out.println("Type 1 for addition.");
        System.out.println("Type 2 for abs.");
        System.out.println("Type 3 for max.");
        System.out.println("Type 4 for sign change.");
    }

    static int loadNumber() {
        System.out.print("Type a number: ");
        return scanner.nextInt();
    }

    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static int abs(int num) {
        return num >= 0 ? num : -num;
    }

    static int max(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max)
            max = num2;
        if (num3 > max)
            max = num3;
        return max;
    }

    static int signChange(int num){
        return -num;
    }
}
