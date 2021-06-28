package com.javarush.task06;

/*
Добро пожаловать! Но не всем.
*/

public class task0607 {
    public static void main(String[] args) {
    }

    public static void signIn(String username) {
        if (username == "user")
            return;
        System.out.println("Добро пожаловать " + username);
        System.out.println("Очень скучали по Вам, " + username);
    }
}

