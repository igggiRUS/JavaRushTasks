package com.javarush.task.Test;

public class BankAccount {

    // поля без аргументов
    int id;
    String name;
    double moneyBalance;


    public static void main(String[] args) {

//  ВЫРАЖЕНИЕ:   СсылочныйТипДанных    Переменная = вызов конструткора создание объекта
        // цель конструктора создать объект
        BankAccount bankAccount = new BankAccount();
        BankAccount myAccount = new BankAccount();
        BankAccount youAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Misha";
        myAccount.moneyBalance = 44000.00;

//      ПримитивныйТипДанных    Переменная = значение;
//        int                        a        = 1;
        System.out.println(myAccount.id);
        System.out.println(myAccount.name);
        System.out.println(myAccount.moneyBalance);

        System.out.println("указатель на ссылку ссылочный тип данных " + bankAccount);
    }
}

