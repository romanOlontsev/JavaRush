package com.javarush.task05;

import java.util.Scanner;
/*
Reverse

Тебе нужно написать программу, которая:
Считывает с консоли целое число N.
Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
Каждое число выводить с новой строки. Число N выводить не нужно.
 */

public class task0505 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        if (n > 0)
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
        if ((n % 2) == 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        } else {
            for (int value : array) {
                System.out.println(value);
            }
        }
    }
}
