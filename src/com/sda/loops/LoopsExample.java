package com.sda.loops;

import java.util.Random;

public class LoopsExample {
    public static void main(String[] args) {
        int x = 5;
        /*while(x>0){
            System.out.println(x--);
        }*/
        /*do {
            System.out.println("Text " + x--);
        } while(x>0);*/
        /*for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        int rand = new Random().nextInt(10);

        for (int i=0; i<5; i++){
            if(i%2==0){
                System.out.println("divisible by 2: " + i);
                continue;
            }
            if(i%3==0){
                System.out.println(i);
                break;
            }
        }
    }
}
