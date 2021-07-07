package com.javarush.task09;

/*
Обновление пути
*/

public class task0914 {

    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int firstIndex = path.indexOf("jdk");
        int secondIndex = path.indexOf('/', firstIndex);
        String old = path.substring(firstIndex, secondIndex);
        return path.replace(old,jdk);
    }
}

