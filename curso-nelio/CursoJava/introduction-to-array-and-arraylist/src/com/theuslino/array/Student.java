package com.theuslino.array;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

    private String name;
    private ArrayList<Integer> marks = new ArrayList<Integer>();


    public Student(String name, int... marks) {
        this.name = name;

        for(int mark: marks) {
            this.marks.add(mark);
        }
    }

    public int getNumberOfMarks() {
        return marks.size();
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int mark:marks){
            sum+= mark;
        }
        return sum;
    }

    public int getMaximumMark() {
        return Collections.max(marks);
    }

    public int getMinimumMark() {
        return Collections.min(marks);
    }

    public BigDecimal getAverageMarks() {
       int sum = getTotalSumOfMarks();
       int number = getNumberOfMarks();
        return new BigDecimal(sum/number);
    }
    public String toString(){
        return name + marks;
    }

    public void addNewMark(int mark) {
        marks.add(mark);
    }

    public void removeMarkAtIndex(int index) {
        marks.remove(index);
    }
}
