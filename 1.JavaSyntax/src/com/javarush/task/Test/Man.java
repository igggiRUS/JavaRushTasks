package com.javarush.task.Test;

public class Man {

    void Man() {
        System.out.println("пустой конструктор\n" +
                " с телом ОБЪЕКТ создан");
    }

    String color;
    String engene;

    public static void main(String[] args) {
        Man man = new Man();
    }


}
