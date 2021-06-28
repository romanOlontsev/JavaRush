package com.javarush.task05;

import java.util.Arrays;

/*
Заполняем массив

Реализуй статический метод main(String[]), который заполняет массив array значениями valueStart и valueEnd.
Если длина массива четная, его первую половину нужно заполнить значениями valueStart, а вторую — valueEnd.
Если длина массива нечётная, то большую часть заполнить значениями valueStart, меньшую — valueEnd.
Для заполнения массива используй метод Arrays.fill(int[], int, int, int).
При тестировании значения полей класса Solution будут разными, учти это.
*/
public class task0516 {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int variable = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        Arrays.fill(array, 0, variable, valueStart);
        Arrays.fill(array, variable, array.length, valueEnd);

        System.out.println(Arrays.toString(array));
    }
}
