package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int minValue = Integer.MAX_VALUE;
            while (scanner.hasNextInt()) {
                int secondMin = scanner.nextInt();
                if (minValue > secondMin) {
                    int temp = minValue;
                    minValue = secondMin;
                    secondMin = temp;
                }
            }
            System.out.println(minValue);
        }
}