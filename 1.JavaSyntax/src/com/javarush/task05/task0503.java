package com.javarush.task05;

/*
Работаем с элементами массива

Реализуй метод main(String[]), который меняет знак элемента массива array на противоположный,
если значение этого элемента чётное.
*/

public class task0503 {

    public static int[] array = new int[]{-1, 2, 3, -4, -5};

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                array[i] = -array[i];
            }
        }
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
}