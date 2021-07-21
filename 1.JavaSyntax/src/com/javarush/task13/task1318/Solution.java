package com.javarush.task13.task1318;

/*
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        int number = month == month.DECEMBER ? 0 : month.ordinal()+1;
        return Month.values()[number];
    }
}