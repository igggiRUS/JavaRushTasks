package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String isEnough = "enough";
        while (true) {
            String string = scanner.nextLine();
            if (!(isEnough.equals(string))) {
                System.out.println(string);
            } else {
                break;
            }
        }
    }
}
