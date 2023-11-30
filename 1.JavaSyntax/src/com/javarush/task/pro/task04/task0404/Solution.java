package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        char q = 'Q';
        int height = 0;


        while (height < 5) {
            int width = 0;
            height++;
            while (width < 10) {
                System.out.print(q);
                width++;

            }
            System.out.println();
        }


    }
}