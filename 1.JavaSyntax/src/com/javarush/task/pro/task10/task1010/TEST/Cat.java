package com.javarush.task.pro.task10.task1010.TEST;

public class Cat {
    //    завод по производству объектов
    private String name;
    private String color;
    private int age;
    public static int count;

    //    сборочная линия
    // сигнатура это название метода типы и колличество парраметров.
    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        count++;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        count++;
    }

    public Cat(String name) {
        this.name = name;
        count++;
    }

    public Cat() {
        name = "dvornyaga";
        count++;
    }

    public void may() {
        System.out.println("may");
    }

}

class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasya", "Cyan", 99);
        Cat cat2 = new Cat("Kesha", "Cyan", 99);
//        Cat cat3 = new Cat()
        System.out.println(Cat.count);
    }
}
