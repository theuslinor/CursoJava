package com.theuslino.loops;

public class MyNumberRunner {

    public static void main(String[] args) {
        MyNumber number = new MyNumber(1234 );
        boolean isPrime = number.isPrime();
        System.out.println("isPrime " + isPrime);

        int sum = number.sumUptoN();
        System.out.println("Sum up to N " + sum);

        int sumOfDivisors = number.sumOfDivisors();
        System.out.println("sumOfDivisors " + sumOfDivisors);

        number.printNumberTriangle();
    }
}
