package com.theuslino.learnspringframework.game;

public class PacManGame implements GamingConsole{
    public void up(){
        System.out.println("Go up");
    }

    public void down(){
        System.out.println("Go down");
    }

    public void left(){
        System.out.println("Go to left");
    }

    public void right(){
        System.out.println("Go to right");
    }
}
