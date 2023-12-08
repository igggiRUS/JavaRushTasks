package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int count = scanner.nextInt();

        do {
            System.out.println(string);
            if (0 >= count || count >= 5) {
                count = 0;
            }
            int i = count--;
        } while (count > 0);

    }
}