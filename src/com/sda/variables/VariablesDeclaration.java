package com.sda.variables;

public class VariablesDeclaration {
    public static void main(String[] args) {
        //byte vByte = 130; impossible
        //short vShort = 40000; impossible
        int vInt = 1;
        long vLong = -4L;
        double vDouble = 2d;
        float vFloat = 4.5f;
        boolean vBoolean = true;
        char vChar1 = 'C';
        char vChar2 = 65;

        System.out.println(vInt);
        System.out.println(vLong);
        System.out.println(vDouble);
        System.out.println(vFloat);
        System.out.println(vBoolean);
        System.out.println(vChar1);
        System.out.println(vChar2);

        vLong = vInt;

        System.out.println(vLong);

        //number value of vChar1
        int vNumberChar = vChar1;

        System.out.println(vNumberChar);
    }
}
