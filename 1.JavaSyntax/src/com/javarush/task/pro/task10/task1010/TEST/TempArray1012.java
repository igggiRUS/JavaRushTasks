package com.javarush.task.pro.task10.task1010.TEST;

import java.util.Arrays;

public class TempArray1012 {


    public static void main(String[] args) {
        String[] array = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        String stringTemp = "";
        int nullCount = 0;
        for (String elNull : array) {
            if (elNull == null) {
                nullCount++;
            }
        }
        while (nullCount > 0) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == null) {
                    array[i] = array[i + 1];
                    array[i + 1] = null;
                }

            }
            nullCount--;

        }
        System.out.println(Arrays.toString(array));
    }
}
