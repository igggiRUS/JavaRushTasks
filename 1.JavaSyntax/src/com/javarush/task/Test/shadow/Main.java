package com.javarush.task.Test.shadow;

import org.w3c.dom.ls.LSOutput;

class Car {
    public static String color = "white";
//    String color = "white";


    public void printColor() {
        String color = "black";
        System.out.println(color);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Car.color);
        Car car = new Car();
        car.printColor(); // печатает black
    }
}