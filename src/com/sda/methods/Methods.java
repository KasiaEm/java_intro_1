package com.sda.methods;

public class Methods {
    public static void main(String[] args) {
        writeMessage();
        writeMessageWithCharacterByASCIINumber(65);

        int sum = add(2, 3);
        System.out.println("Sum of 2 and 3 is " + sum);

        int power = power(2);
        System.out.println("3rd power of 2 is " + power);

        System.out.println("Are 3 and 4 equal? " + isEqual(3, 4));

        System.out.println("Is 10 divisible by 5? " + isDivisible(10, 5));

        System.out.println("Is 65 ASCII code of A? " + isThisCharacterCode('A', 65));

        //a^3 + b^3
        int a = 2;
        int b = 3;
        int result = add(power(a),power(b));
        System.out.println(result);
    }

    static void writeMessage() {
        System.out.println("Message!");
    }

    static void writeMessage(int num) {
        System.out.println("Message! " + num);
    }

    static void writeMessageWithCharacterByASCIINumber(int number) {
        System.out.println("Choosen character: " + (char) number);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int power(int a) {
        return a * a * a;
    }

    static boolean isEqual(int a, int b) {
        return a == b;
    }

    static boolean isDivisible(int a, int b) {
        return a % b == 0;
    }

    static boolean isThisCharacterCode(char c, int code){
        return c==code;
    }
}
