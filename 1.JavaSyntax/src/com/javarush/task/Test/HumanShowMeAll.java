package com.javarush.task.Test;

class Human {

    String name;
    Car33 carMans;
    BankAccountPeople bAccount;

    void infoMan() {
        System.out.println("name" + name);
        System.out.println("Car color" + carMans.color);
        System.out.println("Car engine" + carMans.engine);
        System.out.println("Bank Account" + bAccount.id);
        System.out.println("Bank Account Balance" + bAccount.balance);
    }
}

public class HumanShowMeAll {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Misha";
        human.carMans = new Car33("red", "v8");
        human.bAccount = new BankAccountPeople(123123, 323.32);
    }
}

class Car33 {
    Car33(String colorCar, String engineCar) {
        this.color = colorCar;
        this.engine = engineCar;

    }

    String color;
    String engine;
}

class BankAccountPeople {
    BankAccountPeople(int idPeople, double balanceCard) {
        id = idPeople;
        balance = balanceCard;
    }

    int id;
    double balance;
}
