package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/*
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min = ints[0];
        for (int element : ints) {
            min = Math.min(min, element);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        int[] intArray = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }
}

