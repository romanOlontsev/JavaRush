package com.javarush.task06;

/*
Кубический калькулятор в кубе
*/

public class task0609 {

    public static void main(String[] args) {

    }

    public static long cube(long a) {
        return a * a * a;
    }

    public static long ninthDegree(long a) {
        return cube(cube(a));
    }

}
