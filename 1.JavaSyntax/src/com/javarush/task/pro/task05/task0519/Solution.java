package com.javarush.task.pro.task05.task0519;

import java.util.Arrays;

/* 
Есть ли кто?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
//по условия массив array менять нельзя поэтому создаем копию массива
        int[] copyPublicArray = Arrays.copyOf(array, array.length);
//       Первым параметром нужно передать отсортированный массив,
//       в котором выполнить поиск, вторым параметром — искомый элемент.

        Arrays.sort(copyPublicArray);

//        Метод Arrays.binarySearch(int[], int) возвращает индекс искомого элемента, если такой элемент есть в массиве.
        int index = Arrays.binarySearch(copyPublicArray, element);

        System.out.println(index >= 1);
    }
}
