package com.javarush.task05;
import java.util.Scanner;

/*
Максимальное из N чисел

Чтобы выполнить эту задачу, тебе нужно:
Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив.
Найти максимальное число среди элементов массива и вывести в консоль.
 */

public class task0507 {
    public static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        array = new int[n];
        for (int i = 0; i< array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int i = 0; i< array.length; i++){
            if (array[i] > array[0])
                max = array[i];
        }
        System.out.println(max);
    }
}
