package com.javarush.task04;
import java.util.Scanner;
/*
Стакан наполовину пуст или наполовину полон?

В методе main() есть переменная double glass = 0.5, которая символизирует наполовину заполненный стакан.
Для пессимиста он наполовину пуст, а для оптимиста - наполовину полон.
Необходимо считать с клавиатуры данные типа boolean, используя метод nextBoolean() объекта типа Scanner.
В зависимости от полученных данных, округлить переменную glass: до целого числа вниз (0),
если пессимист (false) и до целого числа вверх (1), если оптимист (true).
Результат вывести на экран.

Пример ввода:
true

Пример вывода:
1

Подсказка:
Чтобы округлить вещественное число до целого вниз, используй метод Math.floor(), вверх - метод Math.ceil().
 */

public class task0418 {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        boolean input = scanner.nextBoolean();
        if (input)
            System.out.println((int) (Math.ceil(glass)));
        else
            System.out.println((int) (Math.floor(glass)));
    }
}
