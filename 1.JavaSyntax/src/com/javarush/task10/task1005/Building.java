package com.javarush.task10.task1005;

/*
Многосерийный предприниматель
*/

public class Building {

    private String type;

    public void initialize(String type){
        this.type = type;
    }
    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Барбершоп");
    }
}

