package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            String string = scanner.nextLine();
            strings[i] = string;
        }
        for (int i = 0; i < strings.length; i++) {
            String temp = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (temp == null) {
                    break;
                }
                if (temp.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }

            }

        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
