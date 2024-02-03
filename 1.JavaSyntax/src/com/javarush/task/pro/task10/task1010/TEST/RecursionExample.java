package com.javarush.task.pro.task10.task1010.TEST;

public class RecursionExample {

        public static void main(String[] args) {
            // 1 * 2 * 3 * 4 * 5 * 6 = 6! обозначение 6 факториалов рекурсия
            int factorial = factorial(6);
            System.out.println("факториал " + factorial);
        }

        public static int factorial(int valueFactorial) {
            if (valueFactorial == 1) {
                return 1;
            }
            // 6 *(5 * (4 * (3 * (2 * 1)))))
            return valueFactorial * factorial(valueFactorial - 1);
        }
    }