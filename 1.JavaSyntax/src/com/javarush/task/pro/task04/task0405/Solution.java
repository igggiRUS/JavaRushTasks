package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        char b = 'Б';
        char x = ' ';
        int height = 0;
        int width = 0;

        while (height < 20) {
            height++;
            System.out.print(b);
        }
        height = 0;
        System.out.println();
        while (width < 8) {
            while (1 > height) {
                height++;
                System.out.print(b);
            }
            while (0 < height && height < 19) {
                height++;
                System.out.print(x);
            }
            while (height < 20) {
                height++;
                System.out.println(b);
            }
            height = 0;
            width++;
        }
        while (height < 20) {
            height++;
            System.out.print(b);
        }
    }
}