package com.javarush.task.pro.task10.task1014;

/* 
Купи 10 батонов
*/

public class Market {
    // в магазине есть яица
    private static boolean hasEggs = true;

    public static void main(String[] args) {
        // если в магазине нет яиц
        boolean hasEggs = false;
        // совершить покупки
        makePurchases(hasEggs);
    }

    public static void makePurchases(boolean hasEggs) {
        if (hasEggs) {
            System.out.println("Купил 10 батонов");
        } else {
            System.out.println("Купил 1 батон");
        }
    }
}
