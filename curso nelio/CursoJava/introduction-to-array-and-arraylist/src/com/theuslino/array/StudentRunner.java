package com.theuslino.array;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {

        Student student = new Student ("Ranga", 99, 98, 100, 95, 75, 10);


        int number = student.getNumberOfMarks();
        System.out.println("Number of marks: " + number);

        int sum = student.getTotalSumOfMarks();
        System.out.println("Sum of marks: " + sum);

        int maximumMark = student.getMaximumMark();
        System.out.println("Maximum of marks: " + maximumMark);

        int minimumMark = student.getMinimumMark();
        System.out.println("Minimum of marks: " + minimumMark);

        BigDecimal average = student.getAverageMarks();
        System.out.println("Average of marks: " + average);

        System.out.println(student);

        student.addNewMark(35);
        System.out.println(student);

        student.removeMarkAtIndex(3);
        System.out.println(student);

    }
}