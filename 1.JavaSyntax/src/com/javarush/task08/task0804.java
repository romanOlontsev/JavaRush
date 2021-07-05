package com.javarush.task08;

public class task0804 {

/*
Randomizer
*/

    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        return (int)(Math.random()*100);
    }
}
