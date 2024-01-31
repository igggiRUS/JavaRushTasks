package com.javarush.task.Test.listArrayLinked;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {

//      тип интерфейс                =     реализация
        List<String> fruitsArrayList = new ArrayList<>();  // под капотом массив доступ по индексу ДОРОГО вставлять новые элементы в СЕРЕДИНУ все элементы сдвигаются правее
        fruitsArrayList.add("apple");
        fruitsArrayList.add("orange");
        fruitsArrayList.add("banana");
        fruitsArrayList.add(2, "watermelon"); // добавление в середину
        System.out.println(fruitsArrayList);   // любая коллекция имеет переопределенный метод toString поэтому в System.out.println() мы передаем саму коллекцию

//      тип интерфейс                 =     реализация
        List<String> fruitsLinkedList = new LinkedList<>(); // построе на базе СВЯЗАННЫХ элементов. Обращение по индексу дороге потому что придется пройти по всей цепочке ДЕШЕВАЯ вставка в середину потому что все элементы связаны
        fruitsLinkedList.add("apple");
        fruitsLinkedList.add("orange");
        fruitsLinkedList.add("banana");
        fruitsLinkedList.add(2, "watermelon"); // добавление в середину
        System.out.println(fruitsLinkedList);   // любая коллекция имеет переопределенный метод toString поэтому в System.out.println() мы передаем саму коллекцию
//      тип интерфейса            =     реализация
        Set<String> fruitsHashSet = new HashSet<>(); // не допускает дублей но сохраняет порядок. Наиболее быстрый внутри себя хранит MAP
        fruitsHashSet.add("apple");
        fruitsHashSet.add("orange");
        fruitsHashSet.add("banana");
        fruitsHashSet.add("apple"); //  Set дубликат hashSet сразу проверяет на дубли и удаляет
        System.out.println(fruitsHashSet + " порядок на основе ключа хеша");

//      тип интерфейса                  =     реализация
        Set<String> fruitsLinkedHashSet = new LinkedHashSet<>(); // Set НЕ ДОПУСКАЕТ дублей НЕ СОХРАНЯЕТ порядок добавления
        fruitsLinkedHashSet.add("apple");
        fruitsLinkedHashSet.add("orange");
        fruitsLinkedHashSet.add("banana");
        fruitsLinkedHashSet.add("apple"); //  Set не допускает дублей LinkedhashSet сразу проверяет на дубли и удаляет
        System.out.println(fruitsLinkedHashSet);

//      тип интерфейса           =     реализация
        Set<String> fruitsTreSet = new TreeSet<>(); // содержит дерево позволяет легко сортировать в порядке возрастание по умолчанию ТК при добавлении идет авто сортировка добавление стоит ДОРОЖЕ
        fruitsTreSet.add("apple");
        fruitsTreSet.add("orange");
        fruitsTreSet.add("banana");
        fruitsTreSet.add("apple");
        System.out.println(fruitsTreSet + " TreeSet авто сортировка из за структуры дерева ");


//      тип интерфейса           =     реализация (MAP отображение) Ingeger кол во символов в слове
        Map<String, Integer> fruitsHashMap = new HashMap<>(); // работает подобно словарю ключ слово коллекция вернет определение (пример)
        fruitsHashMap.putIfAbsent("Айва ", 4);
        fruitsHashMap.putIfAbsent("Алыча ", 5);
        fruitsHashMap.putIfAbsent("Ананас ", 6); // добавлен IfAbscent добавляет эл если его нет в коллекции
        fruitsHashMap.putIfAbsent("яблоко ", 6); // добавлен IfAbscent добавляет эл если его нет в коллекции
        fruitsHashMap.putIfAbsent("Абрикос ", 7);
        fruitsHashMap.putIfAbsent("Апельсин ", 8);
        fruitsHashMap.putIfAbsent("Грейпфрут ", 9);
        fruitsHashMap.putIfAbsent("Чертополох ", 10);

        System.out.println(fruitsHashMap + " TreeSet авто сортировка из за структуры дерева ");

        //      тип интерфейса           =     реализация (MAP отображение) Ingeger кол во символов в слове
        Map<String, Integer> fruitsLinketHashMap = new LinkedHashMap<>(); // Сохраняется порядок добавление
        fruitsLinketHashMap.putIfAbsent("Айва ", 4);
        fruitsLinketHashMap.putIfAbsent("Алыча ", 5);
        fruitsLinketHashMap.putIfAbsent("Ананас ", 6); // добавлен IfAbscent добавляет эл если его нет в коллекции
        fruitsLinketHashMap.putIfAbsent("яблоко ", 6); // добавлен IfAbscent добавляет эл если его нет в коллекции
        fruitsLinketHashMap.putIfAbsent("Абрикос ", 7);
        fruitsLinketHashMap.putIfAbsent("Апельсин ", 8);
        fruitsLinketHashMap.putIfAbsent("Грейпфрут ", 9);
        fruitsLinketHashMap.putIfAbsent("Чертополох ", 10);

        System.out.println(fruitsLinketHashMap + " TreeSet авто сортировка из за структуры дерева ");


        //      тип интерфейса           =     реализация (MAP отображение) Ingeger кол во символов в слове
        Map<String, Integer> fruitsTreetHashMap = new TreeMap<>(); // Сохраняется порядок добавление
        fruitsTreetHashMap.putIfAbsent("Айва ", 4);
        fruitsTreetHashMap.putIfAbsent("Алыча ", 5);
        fruitsTreetHashMap.putIfAbsent("Ананас ", 6); // добавлен IfAbscent добавляет эл если его нет в коллекции
        fruitsTreetHashMap.putIfAbsent("яблоко ", 6); // добавлен IfAbscent добавляет эл если его нет в коллекции
        fruitsTreetHashMap.putIfAbsent("Абрикос ", 7);
        fruitsTreetHashMap.putIfAbsent("Апельсин ", 8);
        fruitsTreetHashMap.putIfAbsent("Грейпфрут ", 9);
        fruitsTreetHashMap.putIfAbsent("Чертополох ", 10);

        System.out.println(fruitsTreetHashMap + " TreeSet авто сортировка из за структуры дерева ");

        /**
         * Методы	Описание
         * void add(тип value)
         * Добавляет в список переданный элемент
         * void add(int index, тип value)
         * Добавляет элемент в определенное место списка.
         * тип get(int index)
         * Возвращает элемент, который находится под номером index
         * void set(int index, тип value)
         * Меняет значение элемента с номером index на value
         * тип remove(int index)
         * Удаляет элемент под номером index. Возвращает удаленный элемент.
         * boolean remove(тип value)
         * Удаляет элемент: нужно передать сам элемент в список. Если таких элементов несколько, будет удален первый из них.
         * void clear()
         * Очищает список — удаляет все элементы из списка.
         * boolean contains(тип value)
         * Проверяет, содержится ли в списке элемент value.
         * boolean isEmpty()
         * Проверяет, пустой список или нет. Равна ли длина списка нулю.
         * int size()
         * Возвращает размер списка — количество элементов списка.
         * тип[] toArray(тип[] array)
         * Возвращает массив, содержащий те же элементы, что и список.
         * Массив нужно передать в метод.
         */


    }

}
