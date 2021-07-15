package com.javarush.task11.task1101;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Человечество живет в Солнечной системе.\n"
                + "Ее возраст около " + SolarSystem.age + " лет.\n"
                + "В Солнечной системе " + SolarSystem.planetsCount + " известных планет.\n"
                + "Как и большинство звездных систем, состоит из " + SolarSystem.starsCount + " звезды.\n"
                + "Звезды по имени " + SolarSystem.starName + ".\n"
                + "Расстояние к центру галактики составляет " + SolarSystem.galacticCenterDistance + " световых лет.\n"
                + "Каждый обитатель Солнечной системы должен знать эту информацию!\n");
    }
}
