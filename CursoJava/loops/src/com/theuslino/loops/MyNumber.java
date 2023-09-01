package com.theuslino.loops;
public class MyNumber {
    private final int number;

    public MyNumber(int number){
        this.number = number;
    }

    public boolean isPrime() {
        if(number<2){
            return false;
        }
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 1) {
                return false;
            }
        }
        return true;
    }

    public int sumUptoN() {
        int sum = 0;

        for (int i = 0; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int sumOfDivisors() {
        int sum = 0;

        for (int i = 2; i <= number -1; i++) {
            if(number % i == 0) {
                sum = sum + i;
            }
        }
        return sum;

    }
}
