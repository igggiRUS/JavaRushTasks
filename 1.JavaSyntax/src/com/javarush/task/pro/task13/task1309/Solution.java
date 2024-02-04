package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<String, Double>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }


    public static void addStudents() {
        grades.put("Коля", 12.4);
        grades.put("Вася", 16.3);
        grades.put("Петя", 18.2);
        grades.put("Леша", 20.1);
        grades.put("Андрюша", 22.0);
    }
}
