package com.sda.methods;

public class MethodsExample {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 5;
        int d = 6;
        int e = 10;

        checkNumber(a);
        checkNumber(b);
        checkNumber(c);
        checkNumber(d);
        checkNumber(e);

        /*int x = 5;

        insaneMethod(x);
        insaneMethod(3);

        int returnedValue = methodToAlwaysReturn1();
        System.out.println(returnedValue);*/

        int sum1 = add(1, 2);
        int sum2 = add(1, 2, 3);
    }

    static void insaneMethod(int param){
        System.out.println("I'm insane. " + param);
    }

    static int methodToAlwaysReturn1(){
        return 1;
    }

    static void checkNumber(int number){
        System.out.println("Is a even and in 0 to 10 (even incremented)? " + (number % 2 == 0 && number >= 0 && (number+1) <= 10));
    }

    static int add(int num1, int num2){
        return num1 + num2;
    }

    static int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

}
