package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
//        System.out.println("вводи: ");
        Scanner scanner = new Scanner(System.in);
        String isEnough = "enough";
        while (true) {
            String string = scanner.nextLine();
            if ((isEnough.equals(string))) {
                System.out.println(isEnough);
                break;
            }

        }
    }
}

