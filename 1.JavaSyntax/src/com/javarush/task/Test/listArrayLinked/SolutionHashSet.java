package com.javarush.task.Test.listArrayLinked;

import java.util.HashSet;

public class SolutionHashSet {

    public HashSet<String> arrayToHashSet(String[] array) {
        // Создаем новый HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Добавляем все элементы из массива в HashSet
        for (String element : array) {
            hashSet.add(element);
        }

        // Возвращаем полученный HashSet
        return hashSet;
    }

    public static void main(String[] args) {
        SolutionHashSet solution = new SolutionHashSet();

        // Пример использования
        String[] array = {"apple", "banana", "cherry", "apple", "banana"};
        HashSet<String> hashSet = solution.arrayToHashSet(array);

        // Выводим элементы HashSet
        for (String element : hashSet) {
            System.out.println(element);
        }
    }
}