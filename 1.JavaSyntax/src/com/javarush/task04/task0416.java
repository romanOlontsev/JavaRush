package com.javarush.task04;
import java.util.Scanner;

/*
Share a Coke

Давай разделим ящик колы на кабинет программистов. Для этого напишем программу, в которой:
Нужно ввести с клавиатуры два целых числа. Первое число - количество банок колы в ящике.
Второе - количество людей в кабинете. Вывести на экран результат деления первого числа на второе.
Результатом должно быть вещественное число.

Пример ввода:
3
2

Пример вывода:
1.5
 */

public class task0416 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println(first*1.0/second);
    }
}
