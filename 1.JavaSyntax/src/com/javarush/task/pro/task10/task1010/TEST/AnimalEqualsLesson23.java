package com.javarush.task.pro.task10.task1010.TEST;

public class AnimalEqualsLesson23 {
    public static void main(String[] args) {

        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
//        сравнение указателей;
        System.out.println(animal1 == animal2);
        System.out.println(animal1.equals(animal2));
        animal1.equals(animal2);

        String string1 = "h";
                String string2 ="h";
        System.out.println(string1.equals(string2));
        System.out.println("String pool " + (string1 == string2));

    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }


    public boolean equals(Object object) {
        Animal otherAnimal = (Animal) object;
        return this.id == otherAnimal.id;


    }

}