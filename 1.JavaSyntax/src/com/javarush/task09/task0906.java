package com.javarush.task09;

import java.util.regex.Pattern;

/*
Двоичный конвертер
*/

public class task0906 {

    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return null;
        }
        String binary = "";
        while (decimalNumber != 0) {
            binary = decimalNumber % 2 + binary;
            decimalNumber /= 2;
        }
        return binary;
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == null) {
            return 0;
        }
        int decimal = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {
            int index = binaryNumber.length() - 1 - i;
            decimal += (Character.getNumericValue(binaryNumber.charAt(index))) * (Math.pow(2, i));
        }
        return decimal;
    }
}

