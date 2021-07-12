package com.javarush.task10.task1002;

/*
Построим новый жилой комплекс JavaRush Towers
*/

public class Skyscraper {

    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    public Skyscraper() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Skyscraper(int floorsCount) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floorsCount);
    }

    public Skyscraper(String buildDev) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + buildDev);
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}

