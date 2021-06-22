package com.javarush.task04;

import java.util.Scanner;

/*
Площадь круга

Для решения этой задачи нужно:
Ввести с клавиатуры положительное целое число radius. Это будет радиус окружности.
Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.
Результатом должно стать целое число (тип int). Для этого нужно привести к типу int результат умножения
(отбросить дробную часть, округлив вниз до целого числа).
В качестве значения pi используй 3.14.
Уточнение:
Если было введено отрицательное число, то на экран ничего не нужно выводить.
Пример ввода:
5
Пример вывода:
78
 */

public class task0415 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        if (radius > 0) {
            int result = (int) (radius * radius * 3.14);
            System.out.println(result);
        }
    }
}
