package com.javarush.task.Test;

public class Submarine {
    int maxDeep;
    int speed;
    int members;
}
class SublmarineType{
    public static void main(String[] args) {

//       На основе класса конструктор создает новый объект и помещает ее в сллочную переменную.
        Submarine submarine1 = new Submarine();
        Submarine submarine2 = new Submarine();
        System.out.println(new Submarine().maxDeep);
    }
}
