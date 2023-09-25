package com.theuslino.oops;
public class MotorBike{
    private int speed; //member variable

    MotorBike(){
    this(5);
    }

    MotorBike(int speed){
        this.speed = speed;
    }
    public void getSpeed(int speed){ //local variable
        if (speed > 0)
            this.speed = speed;
    }

    public void increaseSpeed(int howMuch){
        getSpeed(this.speed + howMuch);
    }
    public void decreaseSpeed(int howMuch){
        getSpeed(this.speed - howMuch);
    }

    int getSpeed() {
        return this.speed;
    }
    void start(){
        System.out.println("Bike Started");
    }
}