package com.javarush.task.pro.task10.task1016;

/* 
Прогноз погоды
*/

public class Solution {

    public static void showWeather(City city) {
        System.out.println("В городе " + city.getName() + " сегодня температура воздуха " +
                city.getTemperature());
    }

    public static void main(String[] args) {
//        в методе показать температуру вызываем класс объект класса с аргументами
        City city = new City ("Дубай", 40);
        City city1 = new City ("Питер", -40);
        showWeather(city);
        showWeather(city1);
    }
}
