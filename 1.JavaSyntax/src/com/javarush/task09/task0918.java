package com.javarush.task09;

public class task0918 {

/*
Поработаем со StringBuilder
*/

    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder newString = new StringBuilder(string);
        for (String elem : strings) {
            newString.append(elem);
        }
        return newString;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder newString = new StringBuilder(string);
        newString.replace(start, end, str);
        return newString;
    }
}
