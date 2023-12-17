package com.javarush.task.pro.task07.task0706;

/* 
Странное деление
*/

public class Solution {
    public static void main(String[] args) {
        double a = (1d / 0d);
        double b = a * 0;
        div(a, b);
    }

    public static void div(double a, double b) {
        System.out.println(b / a);
    }
}
