package com.javarush.task10.task1012;

import java.util.Arrays;
import java.util.Objects;

/*
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        String[] temp = new String[array.length];
        int s = 0;
        for (String value : array) {
            if (value != null) {
                temp[s] = value;
                s++;
            }
        }
        System.arraycopy(temp, 0, array, 0, array.length);
    }
}

