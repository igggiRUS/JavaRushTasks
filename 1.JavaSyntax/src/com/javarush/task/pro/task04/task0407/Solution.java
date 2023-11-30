package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {
        int i = 0;
        int summ = 0;
        while (i < 100) {
            i++;
            if ((i % 3 == 0)) {
                // пропускает выполнение тела цикла
                // если тело соответствует  значению то он возвращается в начало цикла
                continue;
            }
            summ = i + summ;
        }
        System.out.println(summ);
    }

}
