package com.javarush.task18.task1807;

import java.util.ArrayList;
import java.util.Collections;

/*
Прощание с foreach
*/

public class Solution {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");

        print(strings);
    }

    public static void print(ArrayList<String> strings) {
        for (int x = 0; x < strings.size(); x++) {
            System.out.println(strings.get(x));
        }
    }
}