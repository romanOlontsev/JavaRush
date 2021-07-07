package com.javarush.task09;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
*/

public class task0915 {

    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer token = new StringTokenizer(query, delimiter);
        String[] string = new String[3];
        int i = 0;
        while (token.hasMoreTokens()) {
            string[i++] = token.nextToken();
        }
        return string;
    }
}

