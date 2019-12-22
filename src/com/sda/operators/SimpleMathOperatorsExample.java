package com.sda.operators;

public class SimpleMathOperatorsExample {
    public static void main(String[] args) {
        int a = 17;
        int b = 4;
        int addition = a + b; //21
        int substitution = a - b; //13
        int multiplication = a * b; //68
        int division = a / b; //4 cause 17=4*4+1
        int modulo = a % b; //1

        System.out.println("17+4 = " + addition);
        System.out.println("17-4 = " + substitution);
        System.out.println("17*4 = " + multiplication);
        System.out.println("17/4 = " + division);
        System.out.println("17 modulo 4 = " + modulo);
    }
}
