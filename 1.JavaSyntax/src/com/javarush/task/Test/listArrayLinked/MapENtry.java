package com.javarush.task.Test.listArrayLinked;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class MapENtry {
        public static void main(String[] args) {
            // Создаем новую HashMap
            HashMap<String, Integer> map = new HashMap<>();

            // Добавляем несколько элементов в HashMap
            map.put("One", 1);
            map.put("Two", 2);
            map.put("Three", 3);

            // Получаем набор записей из HashMap
            Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

            // Выводим все записи
            for (Map.Entry<String, Integer> entry : entrySet) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }
    }
