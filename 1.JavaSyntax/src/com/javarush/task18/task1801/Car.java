package com.javarush.task18.task1801;

public class Car implements Runnable {

    @Override
    public void run() {
        System.out.println("Car is running!");
    }
}