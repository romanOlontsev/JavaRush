package com.javarush.task11.task1123;

/*
Минимакс
*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair result = getMinimumMaximumPair(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < inputArray.length; i+=2) {
            if (Math.min(inputArray[i - 1], inputArray[i]) < min)
                min = Math.min(inputArray[i - 1], inputArray[i]);
            if (Math.max(inputArray[i - 1], inputArray[i]) > max)
                max = Math.max(inputArray[i - 1], inputArray[i]);
        }
        return new Pair(min, max);
    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
}
