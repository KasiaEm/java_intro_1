package com.sda.operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        char c = '!';

        System.out.println("Is a equal to b? " + (a == b));

        System.out.println("4p.: " + (a >= 0 && a % 2 == 0 && a < 10));

        System.out.println("5p.: " + (a >= 0 && a % 2 != 0 && a < 10));

        System.out.println("6p.: Is c between a and z? " + (c>=97 && c<=122));
        System.out.println("6p.: Is c between a and z? " + (c>='a' && c<='z'));

        System.out.println("7p.: Is c not in between a and z? " + !(c>='a' && c<='z'));

    }
}
