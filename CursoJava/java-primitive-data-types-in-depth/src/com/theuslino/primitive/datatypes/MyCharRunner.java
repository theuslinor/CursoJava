package com.theuslino.primitive.datatypes;

public class MyCharRunner {
    public static void main(String[] args) {
        MyChar myChar = new MyChar('9');
        System.out.println("My Char is a vowel? " + myChar.isVowel());
        System.out.println("My Char is a consonant? " + myChar.isConsonant());
        System.out.println("My Char is a digit? " + myChar.isDigit());
        System.out.println("My Char is in alphabet? " + myChar.isAlphabet());

        MyChar.printLowerCaseAlphabets();
        MyChar.printUpperCaseAlphabets();
    }
}
