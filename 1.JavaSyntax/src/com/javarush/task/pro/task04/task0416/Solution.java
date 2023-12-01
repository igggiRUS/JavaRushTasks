package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cocaCola = scanner.nextInt();
        int programmer = scanner.nextInt();
        float result = (float) cocaCola / programmer;
        System.out.println(result);

    }
}