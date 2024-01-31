//package com.javarush.task.Test;
//
//class Car {
//
//
//    String color;
//    String engine;
//    int speed;
//
//    int gaz(int speed) {
//        speed += speed;
//        return speed;
//    }
//
//    int tormoz(int speed) {
//        speed -= speed;
//        return speed;
//    }
//
//    int summa(int a, int b, int c) {
//        int result = a + b + c;
//        return result;
//    }
//
//    void showInfo(String color, String engine, int speed) {
//        System.out.println(" color " + color + " engine " + engine + " speed " + speed);
//
//    }
//
//    int avgArifm(int a1, int b1, int c1) {
//        // вызвали метов внутри метода
//        int result = summa(a1, b1, c1) / 3;
//        return result;
//    }
//}
//
//public class TestSpeedCar {
//    public static void main(String[] args) {
//        Car2 car2 = new Car2();
//        car2.color = "розовый";
//        car2.engine = "движочек пиражочек";
//        car2.speed = 12;
//
//        car2.avgArifm(21, 43, 54);
//        car2.gaz(23);
//        car2.showInfo("red", "blue", 43);
//    }
//
//}
