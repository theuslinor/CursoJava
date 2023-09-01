package com.theuslino.weekday;

import java.util.Scanner;

public class WeekDay{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the day of the week? \n" +
                "0 - Sunday\n" +
                "1 - Monday\n" +
                "2 - Tuesday\n" +
                "3 - Wednesday\n" +
                "4 - Thursday\n" +
                "5 - Friday\n" +
                "6 - Saturday\n" +
                "Choice a Number: ");
        int choice = scanner.nextInt();
        switch (choice){
            case 0 : {
                System.out.println("Sunday! Come back on a weekday.");
                break;
            }
            case 1 : {
                System.out.println("Monday! Welcome!");
                break;
            }
            case 2 : {
                System.out.println("Tuesday! Welcome!");
                break;
            }
            case 3 : {
                System.out.println("Wednesday! Welcome!");
                break;
            }
            case 4 : {
                System.out.println("Thursday! Welcome!");
                break;
            }
            case 5 : {
                System.out.println("Friday! Welcome!");
                break;
            }
            case 6 : {
                System.out.println("Saturday! Come back on a weekday.");
                break;
            }
            default: {
                System.out.println("Write a number correctly!");
            }
        }
    }
}