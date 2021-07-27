package com.javarush.task15.task1506;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/*
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> list = Files.readAllLines(Paths.get(scanner.nextLine()));
            for (String l : list) {
                for (int i = 0; i < l.length(); i++) {
                    if (l.charAt(i) != ' ' && l.charAt(i) != '.' && l.charAt(i) != ',')
                        System.out.print(l.charAt(i));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}