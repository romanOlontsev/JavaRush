package com.javarush.task08;

/*
Степень двойки
*/

public class task0813 {

    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(3));
    }

    public static int getPowerOfTwo(int power) {
        if (power >= 0)
            return 1 << power;
        else
            return 1 >> -power;

    }
}

