package com.javarush.task09;

/*
Разворот строки
*/

public class task0919 {

    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        String reverseString = new StringBuilder(string).reverse().toString();
        return reverseString;
    }
}