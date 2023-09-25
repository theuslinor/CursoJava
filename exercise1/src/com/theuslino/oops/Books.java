package com.theuslino.oops;

public class Books {
    private int numbOfCopies;

    Books(int numbOfCopies){
        this.numbOfCopies = numbOfCopies;
    }


    public void setNumbOfCopies(int numbOfCopies) {
        if (numbOfCopies > 0)
            this.numbOfCopies = numbOfCopies;
    }

    public int getNumbOfCopies() {
        return numbOfCopies;
    }

    public void increaseCopies(int howMuch) {
        setNumbOfCopies(this.numbOfCopies + howMuch);
    }

    public void decreaseCopies(int howMuch){
        setNumbOfCopies(this.numbOfCopies - howMuch);
    }

    void open() {
        System.out.println("Book is open");
    }
}
