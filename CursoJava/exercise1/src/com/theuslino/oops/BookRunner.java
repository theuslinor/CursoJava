package com.theuslino.oops;

public class BookRunner {
    public static void main(String[] args) {
        Books artofComputerProgramming = new Books(1000);
        Books effectiveJava = new Books(1000);
        Books cleanCode = new Books(1000);

        artofComputerProgramming.open();
        effectiveJava.open();
        cleanCode.open();

        artofComputerProgramming.increaseCopies(65);
        effectiveJava.increaseCopies(765);
        cleanCode.increaseCopies(45);

        artofComputerProgramming.decreaseCopies(54);
        effectiveJava.decreaseCopies(654);
        cleanCode.decreaseCopies(32);

        System.out.println("There are " + artofComputerProgramming.getNumbOfCopies() + " copy numbers of the Art of Computer Programming book.");
        System.out.println("There are " + effectiveJava.getNumbOfCopies() + " copy numbers of the Effective Java book.");
        System.out.println("There are " + cleanCode.getNumbOfCopies() + " copy numbers of the Clean Code book.");

    }
}
