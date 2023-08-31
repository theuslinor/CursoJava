package com.theuslino.primitive.datatypes;

public class BiNumberRunner {
    public static void main(String[] args) {
        BiNumber numbers = new BiNumber(2, 3);
        System.out.println(numbers.add()); //2+3
        System.out.println(numbers.multiply()); //2*3
        numbers.doubleValue(); //double both numbers
        System.out.println(numbers.getNumber1()); //2
        System.out.println(numbers.getNumber2()); //3


        // exemple
        // float f = 34.5f
        // double = 34.5678
    }
}