package com.sda.operators;

public class LogicalOperatorsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;

        System.out.println(!a); //false

        System.out.println(a && b); //true
        System.out.println(a && c); //false
        System.out.println(a && b && c); //false

        System.out.println(a || b); //true
        System.out.println(a || c); //true
        System.out.println(a || b || c); //true

        System.out.println(a || b && c); //true
        System.out.println(a || c && b); //true
        System.out.println((a || b ) && c); //false
    }
}
