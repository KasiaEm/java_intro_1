package com.sda.variables;

public class VariablesCasting {
    public static void main(String[] args) {
        byte vByte = (byte) 130;
        short vShort = (short) 40000;
        int vInt = 1;
        long vLong = -4L;
        double vDouble = 2d;
        float vFloat = 4.5f;
        boolean vBoolean = true;
        char vChar1 = 'C';

        System.out.println(vInt);
        System.out.println(vLong);
        System.out.println(vDouble);
        System.out.println(vFloat);
        System.out.println(vBoolean);
        System.out.println(vChar1);

        long l = vInt;
        int i = (int) vLong;

        System.out.println(l);
        System.out.println(i);

    }
}
