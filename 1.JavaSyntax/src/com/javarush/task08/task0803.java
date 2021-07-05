package com.javarush.task08;

import java.util.Scanner;

/*
Минимальный элемент массива
*/

public class task0803 {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            min = Math.min(min, ints[0]);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }
}

