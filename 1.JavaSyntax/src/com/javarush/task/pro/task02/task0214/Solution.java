package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String one = scanner.nextLine().toLowerCase();
        String two = scanner.nextLine().toUpperCase();
        String three = scanner.nextLine();
        scanner.close();

        System.out.println(three);
        System.out.println(two);
        System.out.println(one);
    }
}
