package com.sda.operators;

public class SimpleMathOperators {
    public static void main(String[] args) {
        double a = 6.3;
        int b = 4;
        float c = 5.5f;
        short d = 1;

        System.out.println("addition " + (a + b));
        System.out.println("substitution " + (c - a));
        System.out.println("multiplication " + (a * c));
        System.out.println("division " + (b / d));
        System.out.println("modulo " + (b % d));
    }
}
