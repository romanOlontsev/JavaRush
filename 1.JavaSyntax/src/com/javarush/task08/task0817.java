package com.javarush.task08;

/*
Инкременты
*/

public class task0817 {

    public static void main(String[] args) {
        int a = 3;
        int b = ++a + (a-- * ++a);
        System.out.println(b);
    }
}

