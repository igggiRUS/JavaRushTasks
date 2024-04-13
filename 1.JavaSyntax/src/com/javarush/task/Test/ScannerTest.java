package com.javarush.task.Test;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
//     на основе класса Scanner создается переменная scanner
//     (у тебя console) = создается новый объект NEW
//     на основе класса Scanner
//     и ему предлагается взять инорфамию из консоли (System.in)

        Scanner scanner = new Scanner(System.in);
//      Создается переменная string =
//        в которую помещается строка из переменной scanner
        // при помощи метода nextLine(); которая считывает строку
        String string = scanner.nextLine();
        System.out.printf(string);
    }
}
