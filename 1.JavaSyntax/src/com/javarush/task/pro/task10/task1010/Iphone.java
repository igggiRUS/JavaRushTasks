package com.javarush.task.pro.task10.task1010;

/*
Два айфона
*/

import java.util.Objects;

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        Iphone iphone = (Iphone) object;
        return price == iphone.price && Objects.equals(model, iphone.model) && Objects.equals(color, iphone.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, price);
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
