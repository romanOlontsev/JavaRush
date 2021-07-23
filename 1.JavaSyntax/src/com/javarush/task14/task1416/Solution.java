package com.javarush.task14.task1416;

/*
Логирование стектрейса
*/

import java.security.spec.ECField;

public class Solution {

    public static void main(String[] args) {
        try {
            dangerousMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void dangerousMethod() throws Exception {
        throw new Exception("Mu-ha-ha!");
    }
}