package com.theuslino.oops;
public class MotorBikeRunner {
    public static void main(String[] args){
        MotorBike ducati = new MotorBike(200);
        MotorBike honda = new MotorBike(139);
        MotorBike kawasaki = new MotorBike();

        ducati.start();
        honda.start();
        kawasaki.start();

        //ducati.getSpeed(100);
        //honda.getSpeed(100);

        ducati.increaseSpeed(245);
        honda.increaseSpeed(150);

        ducati.decreaseSpeed(56);
        honda.decreaseSpeed(42);

        System.out.println("Ducati motorcycle speed is " + ducati.getSpeed() + "km/h.");
        System.out.println("Honda motorcycle speed is " + honda.getSpeed() + "km/h.");
        System.out.println("Kawasaki motorcycle speed is " + kawasaki.getSpeed() + "km/h.");


        honda.getSpeed(80);
        //System.out.println(honda.getSpeed());

    }
}
