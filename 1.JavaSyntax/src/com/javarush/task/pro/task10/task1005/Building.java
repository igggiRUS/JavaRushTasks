package com.javarush.task.pro.task10.task1005;

/* 
Многосерийный предприниматель
*/

public class Building {
    private String type;

    public Building(String type) {
        this.type = type;
    }

    private void initialize(String build) {

    }

    public static void main(String[] args) {
        Building building = new Building("Ресторан");
        building.initialize("Барбершоп");
    }
}
