package com.javarush.task13.task1309;

import java.util.HashMap;

/*
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Nikola", 1.1);
        grades.put("Sasha", 1.3);
        grades.put("Masha", 1.2);
        grades.put("Dima", 1.5);
        grades.put("Sultan", 7.1);
    }
}