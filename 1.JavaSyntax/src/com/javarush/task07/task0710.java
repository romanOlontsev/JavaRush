package com.javarush.task07;

import java.util.Arrays;

/*
Массив значений
*/

public class task0710 {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value) {
        Arrays.fill(array, value);
    }
}

