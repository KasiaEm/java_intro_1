package com.sda.variables.scopes;

public class VariableScopesExample {
    static boolean classVariable = true; //visible in class

    public static void main(String[] args) {
        int methodVariable = 1; //visible only in this method
    }

    static void method(boolean param){ //param visible only in this method
        int methodVariable = 2; //visible only in this method
        if(param){
            short ifVariable = 3; //visible only in this if
        }
    }
}
