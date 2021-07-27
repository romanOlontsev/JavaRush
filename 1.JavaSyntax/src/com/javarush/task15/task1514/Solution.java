package com.javarush.task15.task1514;

import java.nio.file.Path;
import java.util.Scanner;

/*
Все относительно
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        Path path1 = Path.of(str1);
        Path path2 = Path.of(str2);

        try {
            path1.relativize(path2);
        } catch (Exception e) {
            try {
                path2.relativize(path1);
            } catch (Exception ignored) {
            }
        }
    }
}