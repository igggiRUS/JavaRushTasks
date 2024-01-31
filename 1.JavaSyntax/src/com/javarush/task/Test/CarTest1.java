package com.javarush.task.Test;

class Car {
    Car(String cvet, String motor) {
    this.color = cvet;
    this.engene = motor;
    }

    String color;
    String engene;
}

public class CarTest1 {
    public static void main(String[] args) {
        Car car = new Car("yellow", "v4");
        System.out.println(car.color);
        System.out.println(car.engene);
    }
}
