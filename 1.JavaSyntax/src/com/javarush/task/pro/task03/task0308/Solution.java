package com.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xCoordinate = scanner.nextInt();
        int yCoordinate = scanner.nextInt();
        if (xCoordinate > 0 && yCoordinate > 0) {
            System.out.println(1);
        } else if (xCoordinate < 0 && yCoordinate > 0) {
            System.out.println(2);

        } else if (xCoordinate < 0 && yCoordinate < 0) {
            System.out.println(3);

        } else if (xCoordinate > 0 && yCoordinate < 0) {
            System.out.println(4);
        }
    }
}