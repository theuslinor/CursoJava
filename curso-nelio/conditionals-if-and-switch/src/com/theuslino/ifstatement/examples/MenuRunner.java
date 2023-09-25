package com.theuslino.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;

        System.out.println("Enter number 1: ");
        number1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        number2 = scanner.nextInt();
        System.out.println("1 - Add\n" +
                "2 - Subtract \n" +
                "3 - Divide \n" +
                "4 - Multiply \n" +
                "Make your choice: " );
        int choice = scanner.nextInt();

        System.out.println("Number 1: " + number1 + "\n"
        + "Number 2: " + number2);

        //performOperationUsingNestedIfElse(choice, number1, number2);
        performOperationUsingSwitch(choice, number1, number2);
    }

    /**
    private static void performOperationUsingNestedIfElse(int choice, int number1, int number2) {
        if(choice == 1){
            System.out.println("Your choice Add ");
            System.out.println("Result: " + (number1 + number2));
        } else if (choice == 2) {
            System.out.println("Your choice subtract");
            System.out.println("Result: " + (number1 - number2));
        } else if (choice == 3) {
            System.out.println("Your choice divide");
            System.out.println("Result: " + (number1 / number2));
        } else if (choice == 4) {
            System.out.println("Your choice multiply");
            System.out.println("Result: " + (number1 * number2));
        } else {
            System.out.println("Your choice is " + choice);
            System.out.println("Choice the correctly number. ");
        }
    }
     **/

    private static void performOperationUsingSwitch(int choice, int number1, int number2) {
        switch (choice) {
            case 1 -> {
                System.out.println("Your choice Add ");
                System.out.println("Result: " + (number1 + number2));
            }
            case 2 -> {
                System.out.println("Your choice subtract");
                System.out.println("Result: " + (number1 - number2));
            }
            case 3 -> {
                System.out.println("Your choice divide");
                System.out.println("Result: " + (number1 / number2));
            }
            case 4 -> {
                System.out.println("Your choice multiply");
                System.out.println("Result: " + (number1 * number2));
            }
            default -> {
                System.out.println("Your choice is " + choice);
                System.out.println("Choice the correctly number. ");
            }
        }
    }
}
