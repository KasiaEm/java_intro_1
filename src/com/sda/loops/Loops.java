package com.sda.loops;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Sum numbers from 5 to 10");
        System.out.println(sum(5, 10));

        System.out.println("Circle area, when radius=4.5");
        System.out.println(circleArea(4.5));

        System.out.println("Hypotenuse of triangle with sides = 3.5 and 5");
        System.out.println(hypotenuse(3.5, 5));

        System.out.println("Is 31 prime number?");
        System.out.println(isPrimeNumber(4));

        System.out.println("Sum of arithmetic string from 2, step=2, 5 elements.");
        System.out.println(sumArithmeticString(2, 2, 5));

        System.out.println("Sum numbers from 4 to 45 divisible by 6.");
        System.out.println(sumNumbersDivisibleBy(4, 45, 6));

        System.out.println("Factorial for 5.");
        System.out.println(factorial(5));

        System.out.println("Fibonacci 15 elements.");
        fibonacci(15);

        System.out.println("Alphabet:");
        alphabet();
    }

    static int sum(int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }
        return sum;
    }

    static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    static double hypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    static boolean isPrimeNumber(int number) {
        if (number < 0)
            return false;
        for (int i = 2; i < number/2+1; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    static int sumArithmeticString(int start, int step, int nrOfElements){
        if(nrOfElements<=0)
            return 0;
        int sum = 0;
        int current = start;
        while(nrOfElements-->0){
            current+=step;
            sum+=current;
        }
        return sum;
    }

    static int sumNumbersDivisibleBy(int from, int to, int divider){
        int sum = 0;
        for (int i=from; i<=to; i++){
            if(i%divider==0)
                sum+=i;
        }
        return sum;
    }

    static int factorial(int number){
        if(number==0)
            return 1;
        int factorial = 1;
        /*for(int i = 2; i<=number; i++){
            factorial*=i;
        }*/
        while(number>1){
            factorial*=number--;
        }
        return factorial;
    }

    static void fibonacci(int nrOfElements){
        int previous1 = 0;
        int previous2 = 1;
        while(nrOfElements-->0){
            System.out.print(previous2 + " ");
            int tempSum = previous1+previous2;
            previous1=previous2;
            previous2=tempSum;
        }
        System.out.println();
    }

    static void alphabet(){
        for (char c = 'a'; c<='z'; c++){
            System.out.print(c + " ");
        }
    }
}
