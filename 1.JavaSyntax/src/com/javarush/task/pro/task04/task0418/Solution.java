package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        boolean watherLine = scanner.nextBoolean();
        if (watherLine == true) {
//            округление в низ
            System.out.println((int) Math.ceil(glass));
        } else {
//            округление в вверх
            System.out.println((int) Math.floor(glass));
        }
    }
}