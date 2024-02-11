package com.javarush.task.pro.task10.task1015;

/* 
Ежик и яблоко
*/

public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {
        // создать объект Apple Яблоко
        Apple apple = new Apple();
        // создать объект Hedgehog ежик
        Hedgehog hedgehog = new Hedgehog();
        // У объекта класса Hedgehog вызвать метод eat и передать объект класса apple
        hedgehog.eat(apple);
    }

    public static class Apple {
    }
}
