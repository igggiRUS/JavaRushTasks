package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summ = 0;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            summ = summ + number;
        }
        System.out.println(summ);
    }
}