package com.javarush.task.pro.task09.task0905;

/*
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        int octal = 0;
        for (int p10 = 1; 0 < decimalNumber; p10 *= 10) {
            octal = octal + (decimalNumber % 8) * p10;
            decimalNumber = decimalNumber / 8;
        }
        return octal;
    }

    public static int toDecimal(int octalNumber) {
        int decimal = 0;
        for (int p8 = 1; 0 < octalNumber; p8 *= 8) {
            decimal = decimal + (octalNumber % 10) * p8;
            octalNumber = octalNumber / 10;
        }
        return decimal;
    }
}